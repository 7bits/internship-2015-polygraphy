
var requestId = function(event){
    event.preventDefault();
    var token = $('meta[name=_csrf]').attr('content');
    var header = $('meta[name=_csrf_header]').attr('content');
    var headers = {};
    headers[header] = token;

    var id = $(this).attr('id');

    $.ajax({
            type: 'POST',
            dataType: 'json',
            url: '/admin/send-registration-link',
            headers: headers,
            data: {'requestId': id},
            success: function(responseData) {
                var reqId = responseData.id;
                var insideTab = $('.b-inside-tabs__link a[id='+reqId+']');
                $('.b-inside-tabs__generate-link a[id='+reqId+']').parent().hide();
                insideTab.attr('href', responseData.link);
                insideTab.text(responseData.link);
            }
    });
};

var removeBid = function(event){
    event.preventDefault();
    var token = $('meta[name=_csrf]').attr('content');
    var header = $('meta[name=_csrf_header]').attr('content');
    var headers = {};
    headers[header] = token;

    var id = $(this).attr('id');
    var btn = $(this);

    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/admin/remove-request-on-registration',
        headers: headers,
        data: {'requestId': id},
        success: function() {
            $(btn).parent().parent().remove();
        }
    });
};

var removeFromSearch = function(id, btn){
    var token = $('meta[name=_csrf]').attr('content');
    var header = $('meta[name=_csrf_header]').attr('content');
    var headers = {};
    headers[header] = token;

    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/admin/remove-polygraphy',
        headers: headers,
        data: {'polygraphyId': id},
        success: function() {
            $(btn).parent().parent().parent().remove();
            $('.b-popup-verification').fadeOut('fast');
        }
    });
};

var availabilityInSearch = function(event){
    event.preventDefault();
    var token = $('meta[name=_csrf]').attr('content');
    var header = $('meta[name=_csrf_header]').attr('content');
    var headers = {};
    headers[header] = token;

    var label = $(this);
    var id = $(this).attr('for');
    var name = $(this).attr('data-name');
    var checkbox = $('.b-inside-tabs__checkbox[id='+id+']');
    var curCondition = checkbox.prop('checked');

    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/admin/change-condition-display-polygraphy',
        headers: headers,
        data: {
                  'polygraphyId': id,
                  'curCondition': curCondition
              },
        success: function(data) {
            if (curCondition){
                $(checkbox).prop('checked', false);
                $(label).css('backgroundPositionY', '0px');
                $.gritter.add({
                    title: name,
                    text: 'Полиграфия была исключена из поиска'
                });
            }
            else{
                $(checkbox).prop('checked', true);
                $(label).css('backgroundPositionY', '-30px');
                $.gritter.add({
                    title: name,
                    text: 'Полиграфия была добавлена в поиск'
                });
            }
        }
    });
};

var hidePopupWindow = function(event) {
    event || window.event
    if (event.target == this) {
        $('.b-popup-verification').fadeOut('fast');
        $('body').css('overflow', 'auto');
    }
};

var switchTabs = function(){
    $(this).removeClass('b-tabs__js-inactive-tab').addClass('b-tabs__js-active-tab');
    $(this).siblings().removeClass('b-tabs__js-active-tab').addClass('b-tabs__js-inactive-tab');
    var id = $(this).attr('id');
    var insideActiveTab = $('.b-inside-tabs__content[id=inside-'+id+']');
    insideActiveTab.siblings().removeClass('b-inside-tabs__js-inside-active-tab').addClass('b-inside-tabs__js-inside-inactive-tab');
    insideActiveTab.removeClass('b-inside-tabs__js-inside-inactive-tab').addClass('b-inside-tabs__js-inside-active-tab');
};

$(document).ready(function(){

    $('.b-tabs__tab').on('click', switchTabs);

    $('.b-inside-tabs__table-row').on('click', '.b-inside-tabs__generate-link a', requestId);

    $('.b-inside-tabs__label').on('click', availabilityInSearch);

    $('.b-inside-tabs__js-remove-bid').on('click', removeBid);

    $('.b-inside-tabs__js-remove-from-search').on('click', function(){

        var id = $(this).attr('id');
        var btn = $(this);
        var verification = $('.b-popup-verification');
        var verificationClass = verification.attr('class');

        verification.fadeIn('fast');

        $('.'+verificationClass+'__main').on('click', '.'+verificationClass+'__answer', function(){
            if ($(this).attr('answer')=='yes'){
                removeFromSearch(id, btn);
            }
            else{
                verification.fadeOut('fast');
            }
        })
    });

    $('.b-popup-verification').click(hidePopupWindow);

});