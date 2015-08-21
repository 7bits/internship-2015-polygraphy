
var requestId = function(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
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
                $('.generate-link a[id='+reqId+']').parent().hide();
                $('.link a[id='+reqId+']').attr('href', responseData.link);
                $('.link a[id='+reqId+']').text(responseData.link);
            }
    });
}

var removeBid = function(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
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
        success: function(data) {
            var reqId = data.id;
            $(btn).parent().parent().remove();
        }
    });
}

var removeFromSearch = function(id, btn){
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;

    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/admin/remove-polygraphy',
        headers: headers,
        data: {'polygraphyId': id},
        success: function(data) {
            var reqId = data.id;
            $(btn).parent().parent().parent().remove();
            $('.pop-up-overlay').fadeOut("fast");
            //$('body').css('overflow', 'auto');
        }
    });
}

var availabilityInSearch = function(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;

    var label = $(this);
    var id = $(this).attr('for');
    var name = $(this).attr('data-name');
    var checkbox = $('.checkbox[id='+id+']');
    var curCondition = $('.checkbox[id='+id+']').prop('checked');

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
}

var hidePopupWindow = function(event) {
    event || window.event
    if (event.target == this) {
        $('.pop-up-overlay').fadeOut("fast");
        $('body').css('overflow', 'auto');
    }
}

$(document).ready(function(){

    $('.tab1').on('click', function(){
        $('.for-tab2').css('display', 'none');
        $('.tab2').css('backgroundColor', 'rgb(240, 240, 240)');
        $('.for-tab1').css('display', 'block');
        $('.tab1').css('backgroundColor', 'rgb(232, 232, 232)');
    });

    $('.tab2').on('click', function(){
        $('.for-tab1').css('display', 'none');
        $('.tab1').css('backgroundColor', 'rgb(240, 240, 240)');
        $('.for-tab2').css('display', 'block');
        $('.tab2').css('backgroundColor', 'rgb(232, 232, 232)');
    });

    $('.row').on('click', '.generate-link a', requestId);

    $('.label-for-checkbox').on('click', availabilityInSearch);

    $('.remove-bid').on('click', removeBid);

    $('.remove-from-search').on('click', function(){

        var id = $(this).attr('id');
        var btn = $(this);

        //$('body').css('overflow', 'hidden');
        $('.pop-up-overlay').css('overflow', 'auto');
        $('.pop-up-overlay').fadeIn("fast");

        $('.main-pop-up').on('click', '.yes', function(){
            $(this).data('clicked', true);
            if ($('.yes').data('clicked', true)){
                removeFromSearch(id, btn);
            }
        });

        $('.main-pop-up').on('click', '.no', hidePopupWindow);
    });

    $('.pop-up-overlay').click(hidePopupWindow);

});