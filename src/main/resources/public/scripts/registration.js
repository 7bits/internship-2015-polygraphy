
var validateSecondStep = function(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;

    /* Поля первого шага */
    var hash = $("#hash").attr('value');
    var email = $('#email-input').val();
    var password = $('#password-input').val();
    var name = $('#name-input').val();
    var address = $('#address-input').val();
    var phone = $('#phone-input').val();
    var publicEmail = $('#email-public-input').val();
    var website = $('#website-input').val();
    var textArea = $('#text-area-field').val();

    /* Поля второго шага*/
    var paymentMethods = [];
    $('.js-pm:checked').each(function(i){ paymentMethods.push($(this).attr('value')); });
    var deliveryMethods = [];
    $('.js-dm:checked').each(function(i){ deliveryMethods.push($(this).attr('value')); });
    var services = [];
    $('.js-s:checked').each(function(i){ services.push($(this).attr('value')); });
    var writesTheCheck = $('.js-wtc').prop('checked');
    var orderByEmail = $('.js-obe').prop('checked');

    $('.invalid-payment-method').css('display', 'none');
    $('.invalid-delivery-method').css('display', 'none');
    $('.invalid-services').css('display', 'none');

    $('.for-error-payment-method').css('display', 'none');
    $('.for-error-delivery-method').css('display', 'none');
    $('.for-error-services').css('display', 'none');

    $('.invalid-payment-method').text('');
    $('.invalid-delivery-method').text('');
    $('.invalid-services').text('');

    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/registration/second-step',
        headers: headers,
        contentType: 'application/json',
        data: JSON.stringify({
            firstForm: {
                'email': email,
                'password': password,
                'name': name,
                'address': address,
                'phone': phone,
                'publicEmail': publicEmail,
                'website': website,
                'info': textArea,
                'hash': hash
            },
            secondForm: {
                'paymentMethods': paymentMethods,
                'deliveryMethods': deliveryMethods,
                'services': services,
                'writesTheCheck': writesTheCheck,
                'orderByEmail': orderByEmail
            }
              }),
        success: function(data) {
            if(data.success){
                window.location.href = '/registration-success';
            }
            else{
                if (data.errors['paymentMethods']){
                    $('.for-error-payment-method').css('display', 'block');
                    $('.invalid-payment-method').css('display', 'block');
                    $('.invalid-payment-method').text(data.errors['paymentMethods']);
                }
                else {
                    $('.for-error-payment-method').css('display', 'none');
                    $('.invalid-payment-method').css('display', 'none');
                };

                if (data.errors['deliveryMethods']){
                    $('.for-error-delivery-method').css('display', 'block');
                    $('.invalid-delivery-method').css('display', 'block');
                    $('.invalid-delivery-method').text(data.errors['deliveryMethods']);
                }
                else {
                    $('.for-error-delivery-method').css('display', 'none');
                    $('.invalid-delivery-method').css('display', 'none');
                };

                if (data.errors['services']){
                    $('.for-error-services').css('display', 'block');
                    $('.invalid-services').css('display', 'block');
                    $('.invalid-services').text(data.errors['services']);
                }
                else {
                    $('.for-error-services').css('display', 'none');
                    $('.invalid-services').css('display', 'none');
                };
            }
        }
    });
}

$(document).ready(function(){

    $('input').attr('autocomplete', 'off');

    $('.registration-form').on('click', '.submit-registration-form', validateSecondStep);

});
