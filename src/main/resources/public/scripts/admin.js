
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
            url: '/admin/registration-link',
            headers: headers,
            data: {'requestId': id},
            success: function(responseData) {
                
            }
    });
}

$(document).ready(function(){

    $('.admin-form').on('click', 'td.col-link a', requestId);

});