(function () {
    'use strict';

    var validateForm = function(event){
        event.preventDefault();
        var token = $('meta[name=_csrf]').attr('content');
        var header = $('meta[name=_csrf_header]').attr('content');
        var headers = {};
        headers[header] = token;

        var input = $('.general-input__input[type=text]');
        var invalid = $('.general-input__invalid');
        var forError = $('.general-input__for-error');

        var email = input.val();

        input.addClass('js-normal-input').removeClass('js-error-input');
        invalid.addClass('js-none-display').removeClass('js-display-block');
        forError.addClass('js-none-display').removeClass('js-display-block');
        invalid.text('');

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
                    window.App.displayErrors(data);
                }
            }
        });
    };

    $(document).ready(function(){

        $('input').attr('autocomplete', 'off');
        $('.general-submit[id=submit-email]').click(validateForm);

        $('#request-form').bind('keypress', function(e) {
            if (e.keyCode === 13) {
                e.preventDefault();
                validateForm();
                return false;
            }
        });

    });
})();