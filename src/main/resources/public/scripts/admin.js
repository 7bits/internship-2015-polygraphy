
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
            url: '/admin/generate-registration-link',
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

var removeFromSearch = function(event){
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
        url: '/admin/remove-polygraphy',
        headers: headers,
        data: {'requestId': id},
        success: function(data) {
            var reqId = data.id;
            $(btn).parent().parent(),parent().remove();
        }
    });
}

var availabilityInSearch = function(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;

    var checkbox = $(this);
    var id = $(this).attr('for');
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
            if ($(checkbox).prop('checked')){
                $(this).removeAttr('checked');
            }
            else{
                $(this).attr('checked', 'checked');
            }
        }
    });
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

    $('.remove-from-search').on('click', removeFromSearch);

});