
var validateForm = function(){
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;
    var email = $('.email-input').val();
    var formId = $(this).attr('form');

    $('.email-input').css('borderColor', 'white');
    $('.error-container').css('display', 'none');
    $('.email-input').text('');
    $('.for-error').css('display', 'none');

    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/info-for-polygraphy',
        headers: headers,
        data: {'email': email},
        success: function(data) {
            if(data.success){
                window.location.href = '/info-for-polygraphy-success';
            }
            else{
                            if (data.errors['email']){
                                $('.email-input').css('borderColor', '#ea5c59');
                                $('.for-error').css('display', 'block');
                                $('.error-container').css('display', 'block');
                                $('.error-container').text(data.errors['email']);
                            }
                            else {
                                $('.email-input').css('borderColor', 'white');
                                $('.for-error').css('display', 'none');
                                $('.error-container').css('display', 'none');
                            };
            }
        }
    });
}

$(document).ready(function(){

    $('input').attr('autocomplete', 'off');
    $('.submit-email').click(validateForm);

    $('#request-form').bind("keypress", function(e) {
        if (e.keyCode == 13) {
            e.preventDefault();
            validateForm();
            return false;
        }
    });

});