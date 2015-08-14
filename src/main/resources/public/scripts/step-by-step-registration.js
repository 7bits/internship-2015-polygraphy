(function($) {
    $.fn.formToWizard = function(options) {
        options = $.extend({
            submitButton: ""
        }, options);

        var element = this;

        var steps = $(element).find("fieldset");
        var count = steps.size();
        var submitButtonName = "#" + options.submitButton;
        $(submitButtonName).hide();

        // 2
        $(element).before("<ul id='steps'></ul>");

        steps.each(function(i) {
            $(this).wrap("<div id='step" + i + "'></div>");
            $(this).append("<div id='step" + i + "commands'></div>");

            // 2
            //var name = $(this).find("legend").html();
            $("#steps").append("<li id='stepDesc" + i + "'>Шаг " + (i + 1) + /*"<span>" + name + "</span>*/"</li>");

            if (i == 0) {
                createNextButton(i);
                selectStep(i);
            }
            else if (i == count - 1) {
                $("#step" + i).hide();
                createPrevButton(i);
            }
            else {
                $("#step" + i).hide();
                createPrevButton(i);
                createNextButton(i);
            }
        });

        function createPrevButton(i) {
            var stepName = "step" + i;
            $("#" + stepName + "commands").append("<a href='#' id='" + stepName + "Prev' class='prev'>< Предыдущий шаг</a>");

            $("#" + stepName + "Prev").bind("click", function(e) {
                $("#" + stepName).hide();
                $("#step" + (i - 1)).show();
                $(submitButtonName).hide();
                selectStep(i - 1);
            });
        }

        function createNextButton(i) {
            var stepName = "step" + i;
            $("#" + stepName + "commands").append("<a href='#' id='" + stepName + "Next' class='next'>Следующий шаг ></a>");

            $("#" + stepName + "Next").bind("click", function(event) {
                event.preventDefault();
                var token = $("meta[name='_csrf']").attr("content");
                var header = $("meta[name='_csrf_header']").attr("content");
                var headers = {};
                headers[header] = token;

                var hash = $("#hash").attr('value');
                var email = $('#email-input').val();
                var password = $('#password-input').val();
                var name = $('#name-input').val();
                var address = $('#address-input').val();
                var phone = $('#phone-input').val();
                var publicEmail = $('#email-public-input').val();
                var website = $('#website-input').val();
                var textArea = $('#text-area-field').val();

                $('.invalid-email').css('display', 'none');
                $('.invalid-password').css('display', 'none');
                $('.invalid-name').css('display', 'none');
                $('.invalid-address').css('display', 'none');
                $('.invalid-phone').css('display', 'none');
                $('.invalid-public-email').css('display', 'none');
                $('.base-error').css('display', 'none');

                $('.form-control#email-input').css('borderColor', 'white');
                $('.form-control#password-input').css('borderColor', 'white');
                $('.form-control#name-input').css('borderColor', 'white');
                $('.form-control#address-input').css('borderColor', 'white');
                $('.form-control#phone-input').css('borderColor', 'white');
                $('.form-control#email-public-input').css('borderColor', 'white');

                $('.invalid-email').text('');
                $('.invalid-password').text('');
                $('.invalid-name').text('');
                $('.invalid-address').text('');
                $('.invalid-phone').text('');
                $('.invalid-public-email').text('');
                $('.base-error').text('');

                $.ajax({
                    type: 'POST',
                    dataType: 'json',
                    url: '/registration/first-step',
                    headers: headers,
                    contentType: 'application/json',
                    data: JSON.stringify({
                            'email': email,
                            'password': password,
                            'name': name,
                            'address': address,
                            'phone': phone,
                            'publicEmail': publicEmail,
                            'website': website,
                            'textArea': textArea,
                            'hash': hash
                          }),
                    success: function(data) {
                        if(data.success){
                            //применяем действие по умолчанию для кнопки "Следующий шаг"
                            $("#" + stepName).hide();
                            $("#step" + (i + 1)).show();
                            if (i + 2 == count)
                                $(submitButtonName).show();
                            selectStep(i + 1);
                        }
                        else{
                            if (data.errors['base']){
                                $('.base-error').css('display', 'block');
                                $('.base-error').text(data.errors['base']);
                            }
                            else {
                                $('.base-error').css('display', 'none');

                                if (data.errors['email']){
                                    $('.form-control#email-input').css('borderColor', 'red');
                                    $('.invalid-email').css('display', 'block');
                                    $('.invalid-email').text(data.errors['email']);
                                }
                                else {
                                    $('.form-control#email-input').css('borderColor', 'white');
                                    $('.invalid-email').css('display', 'none');
                                };

                                if (data.errors['password']){
                                    $('.form-control#password-input').css('borderColor', 'red');
                                    $('.invalid-password').css('display', 'block');
                                    $('.invalid-password').text(data.errors['password']);
                                }
                                else {
                                    $('.form-control#password-input').css('borderColor', 'white');
                                    $('.invalid-password').css('display', 'none');
                                };

                                if (data.errors['name']){
                                    $('.form-control#name-input').css('borderColor', 'red');
                                    $('.invalid-name').css('display', 'block');
                                    $('.invalid-name').text(data.errors['name']);
                                }
                                else {
                                    $('.form-control#name-input').css('borderColor', 'white');
                                    $('.invalid-name').css('display', 'none');
                                };

                                if (data.errors['address']){
                                    $('.form-control#address-input').css('borderColor', 'red');
                                    $('.invalid-address').css('display', 'block');
                                    $('.invalid-address').text(data.errors['address']);
                                }
                                else {
                                    $('.form-control#address-input').css('borderColor', 'white');
                                    $('.invalid-address').css('display', 'none');
                                };

                                if (data.errors['phone']){
                                    $('.form-control#phone-input').css('borderColor', 'red');
                                    $('.invalid-phone').css('display', 'block');
                                    $('.invalid-phone').text(data.errors['phone']);
                                }
                                else {
                                    $('.form-control#phone-input').css('borderColor', 'white');
                                    $('.invalid-phone').css('display', 'none');
                                };

                                if (data.errors['publicEmail']){
                                    $('.form-control#email-public-input').css('borderColor', 'red');
                                    $('.invalid-public-email').css('display', 'block');
                                    $('.invalid-public-email').text(data.errors['publicEmail']);
                                }
                                else {
                                    $('.form-control#email-public-input').css('borderColor', 'white');
                                    $('.invalid-public-email').css('display', 'none');
                                };
                            };

                        }
                    }
                });
            });
        }

        function selectStep(i) {
            $("#steps li").removeClass("current");
            $("#stepDesc" + i).addClass("current");
        }

    }
})(jQuery);

$(document).ready(function(){

    $('input').attr('autocomplete', 'off');

    $("#registration-form").formToWizard({ submitButton: 'submit-registration-form' });

});