
/*var validateRegistrationForm = function(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;

    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/registration-link',
        headers: headers,
        data: {'email': email},
        success: function(data) {
        }
    });
}

$(document).ready(function(){

    $('.next').click(validateRegistrationForm);

});*/