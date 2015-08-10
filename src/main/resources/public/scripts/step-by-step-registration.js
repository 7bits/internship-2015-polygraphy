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

                var email = $('#email-input').val();
                var password = $('#password-input').val();
                var name = $('#name-input').val();
                var address = $('#address-input').val();
                var phone = $('#phone-input').val();
                var publicEmail = $('#email-public-input').val();
                var website = $('#website-input').val();
                var textArea = $('#text-area-field').val();

                $('.invalid-email').text('');
                $('.invalid-password').text('');
                $('.invalid-name').text('');
                $('.invalid-address').text('');
                $('.invalid-phone').text('');
                $('.invalid-public-email').text('');

                $.ajax({
                    type: 'POST',
                    dataType: 'json',
                    url: '/registration-link',
                    headers: headers,
                    data: {
                            'email': email,
                            'password': password,
                            'name': name,
                            'address': address,
                            'phone': phone,
                            'publicEmail': publicEmail,
                            'website': website,
                            'textArea': textArea
                          },
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
                            $('.invalid-email').text(data.errors['email']);
                            $('.invalid-password').text(data.errors['password']);
                            $('.invalid-name').text(data.errors['name']);
                            $('.invalid-address').text(data.errors['address']);
                            $('.invalid-phone').text(data.errors['phone']);
                            $('.invalid-public-email').text(data.errors['publicEmail']);
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
           $("#registration-form").formToWizard({ submitButton: 'submit-registration-form' })
       });