(function($) {
    $.fn.formToWizard = function(options) {
        options = $.extend({
            submitButton: ''
        }, options);

        var element = this;

        var steps = $(element).find('fieldset');
        var count = steps.size();
        var submitButtonName = '#' + options.submitButton;
        $(submitButtonName).hide();

        // 2
        $(element).before('<ul id="steps"></ul>');

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
                $('#step' + i).hide();
                createPrevButton(i);
            }
            else {
                $('#step' + i).hide();
                createPrevButton(i);
                createNextButton(i);
            }
        });

        function createPrevButton(i) {
            var stepName = 'step' + i;
            $('#' + stepName + 'commands').append("<a href='#' id='" + stepName + "Prev' class='prev'>< Предыдущий шаг</a>");

            $('#' + stepName + 'Prev').bind('click', function(e) {
                $('#' + stepName).hide();
                $('#step' + (i - 1)).show();
                $(submitButtonName).hide();
                selectStep(i - 1);
            });
        }

        function createNextButton(i) {
            var stepName = 'step' + i;
            $('#' + stepName + 'commands').append("<a href='#' id='" + stepName + "Next' class='next'>Следующий шаг ></a>");

            $('#' + stepName + 'Next').bind('click', function(event) {
                event.preventDefault();
                var token = $("meta[name='_csrf']").attr("content");
                var header = $("meta[name='_csrf_header']").attr('content');
                var headers = {};
                headers[header] = token;

                $('.input-field').css('borderColor', 'white');
                $('.invalid').css('display', 'none');
                $('.for-error').css('display', 'none');
                $('.invalid').text('');

                CKEDITOR.instances['text-area-field'].updateElement();
                var textArea = $('#text-area-field').val();
                $('.base-error').css('display', 'none');
                $('.base-error').text('');

                var names = {}
                $('.input-field').each(function(){
                    names[$(this).attr('name')] = $(this).val();
                });

                $.ajax({
                    type: 'POST',
                    dataType: 'json',
                    url: '/registration/first-step',
                    headers: headers,
                    contentType: 'application/json',
                    data: JSON.stringify({
                            'email': names.email,
                            'password': names.password,
                            'name': names.name,
                            'address': names.address,
                            'phone': names.phone,
                            'publicEmail': names.publicEmail,
                            'website': names.website,
                            'textArea': textArea,
                            'hash': names.hash
                          }),
                    success: function(data) {
                        if(data.success){
                            //применяем действие по умолчанию для кнопки "Следующий шаг"
                            $('#' + stepName).hide();
                            $('#step' + (i + 1)).show();
                            if (i + 2 == count)
                                $(submitButtonName).show();
                            selectStep(i + 1);
                        }
                        else{
                            displayErrors(data);
                        }
                    }
                });
            });
        }

        function selectStep(i) {
            $("#steps li").removeClass('current');
            $('#stepDesc' + i).addClass('current');
        }

    }
})(jQuery);

$(document).ready(function(){

    $('input').attr('autocomplete', 'off');

    $('#registration-form').formToWizard({ submitButton: 'submit-registration-form' });

});