
var validateForm = function(){
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;
    var email = $('.b-bid__email-input').val();
    var formId = $(this).attr('form');

    $('.b-bid__email-input').css('borderColor', 'white');
    $('.b-bid__error-container').css('display', 'none');
    $('.b-bid__email-input').text('');
    $('.b_bid__for-error').css('display', 'none');

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
                                $('.b-bid__email-input').css('borderColor', '#ea5c59');
                                $('.b_bid__for-error').css('display', 'block');
                                $('.b-bid__error-container').css('display', 'block');
                                $('.b-bid__error-container').text(data.errors['email']);
                            }
                            else {
                                $('.b-bid__email-input').css('borderColor', 'white');
                                $('.b_bid__for-error').css('display', 'none');
                                $('.b-bid__error-container').css('display', 'none');
                            };
            }
        }
    });
}

$(document).ready(function(){

    $('input').attr('autocomplete', 'off');
    $('.b-bid__submit-email').click(validateForm);

    $('#request-form').bind("keypress", function(e) {
        if (e.keyCode == 13) {
            e.preventDefault();
            validateForm();
            return false;
        }
    });

});