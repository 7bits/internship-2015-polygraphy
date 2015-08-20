
var validateEditForm = function(){
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;

    var url = $('form').attr('action');

    var polygraphyId = $('#polygraphy-id').val();
    var email = $('#email-input').val();
    var password = $('#password-input').val();
    var name = $('#name-input').val();
    var address = $('#address-input').val();
    var phone = $('#phone-input').val();
    var publicEmail = $('#email-public-input').val();
    var website = $('#website-input').val();
    var textArea = $('#text-area-field').val();
    var writesTheCheck = $('.js-wtc').prop('checked');
    var orderByEmail = $('.js-obe').prop('checked');
    var paymentMethods = [];
    $('.js-pm:checked').each(function(i){ paymentMethods.push($(this).attr('value')); });
    var deliveryMethods = [];
    $('.js-dm:checked').each(function(i){ deliveryMethods.push($(this).attr('value')); });
    var services = [];
    $('.js-s:checked').each(function(i){ services.push($(this).attr('value')); });
/*

    $('.invalid-email').css('display', 'none');
    $('.invalid-password').css('display', 'none');
    $('.invalid-name').css('display', 'none');
    $('.invalid-address').css('display', 'none');
    $('.invalid-phone').css('display', 'none');
    $('.invalid-public-email').css('display', 'none');
    $('.base-error').css('display', 'none');
    $('.invalid-payment-method').css('display', 'none');
    $('.invalid-delivery-method').css('display', 'none');
    $('.invalid-services').css('display', 'none');

    $('#email-input').css('borderColor', 'white');
    $('#password-input').css('borderColor', 'white');
    $('#name-input').css('borderColor', 'white');
    $('#address-input').css('borderColor', 'white');
    $('#phone-input').css('borderColor', 'white');
    $('#email-public-input').css('borderColor', 'white');

    $('.invalid-email').text('');
    $('.invalid-password').text('');
    $('.invalid-name').text('');
    $('.invalid-address').text('');
    $('.invalid-phone').text('');
    $('.invalid-public-email').text('');
    $('.base-error').text('');
    $('.invalid-payment-method').text('');
    $('.invalid-delivery-method').text('');
    $('.invalid-services').text('');
*/

    $.ajax({
        type: 'PUT',
        dataType: 'json',
        url: url,
        headers: headers,
        contentType: 'application/json',
        data: JSON.stringify({
                'polygraphyId': polygraphyId,
                'email': email,
                'password': password,
                'name': name,
                'address': address,
                'phone': phone,
                'publicEmail': publicEmail,
                'website': website,
                'info': textArea,
                'paymentMethods': paymentMethods,
                'deliveryMethods': deliveryMethods,
                'services': services,
                'writesTheCheck': writesTheCheck,
                'orderByEmail': orderByEmail
        }),
        success: function(data) {

            if(data.success){
                window.location.href = '/info-for-polygraphy-success';
            }
            else{
                if (data.errors['base']){
                    $('.base-error').css('display', 'block');
                    $('.base-error').text(data.errors['base']);
                }
                else {
                    $('.base-error').css('display', 'none');

//                        if (data.errors['email']){
//                            $('#email-input').css('borderColor', 'red');
//                            $('.invalid-email').css('display', 'block');
//                            $('.invalid-email').text(data.errors['email']);
//                        }
//                        else {
//                            $('#email-input').css('borderColor', 'white');
//                            $('.invalid-email').css('display', 'none');
//                        }
//
//                        if (data.errors['password']){
//                            $('#password-input').css('borderColor', 'red');
//                            $('.invalid-password').css('display', 'block');
//                            $('.invalid-password').text(data.errors['password']);
//                        }
//                        else {
//                            $('#password-input').css('borderColor', 'white');
//                            $('.invalid-password').css('display', 'none');
//                        }

                    if (data.errors['name']){
                        $('#name-input').css('borderColor', 'red');
                        $('.invalid-name').css('display', 'block');
                        $('.invalid-name').text(data.errors['name']);
                    }
                    else {
                        $('#name-input').css('borderColor', 'white');
                        $('.invalid-name').css('display', 'none');
                    }

                    if (data.errors['address']){
                        $('#address-input').css('borderColor', 'red');
                        $('.invalid-address').css('display', 'block');
                        $('.invalid-address').text(data.errors['address']);
                    }
                    else {
                        $('#address-input').css('borderColor', 'white');
                        $('.invalid-address').css('display', 'none');
                    }

                    if (data.errors['phone']){
                        $('#phone-input').css('borderColor', 'red');
                        $('.invalid-phone').css('display', 'block');
                        $('.invalid-phone').text(data.errors['phone']);
                    }
                    else {
                        $('#phone-input').css('borderColor', 'white');
                        $('.invalid-phone').css('display', 'none');
                    }

                    if (data.errors['publicEmail']){
                        $('#email-public-input').css('borderColor', 'red');
                        $('.invalid-public-email').css('display', 'block');
                        $('.invalid-public-email').text(data.errors['publicEmail']);
                    }
                    else {
                        $('#email-public-input').css('borderColor', 'white');
                        $('.invalid-public-email').css('display', 'none');
                    }


                    if (data.errors['paymentMethods']) {
                        $('.invalid-payment-method').css('display', 'block');
                        $('.invalid-payment-method').text(data.errors['paymentMethods']);
                    }
                    else {
                        $('.invalid-payment-method').css('display', 'none');
                    }

                    if (data.errors['deliveryMethods']) {
                        $('.invalid-delivery-method').css('display', 'block');
                        $('.invalid-delivery-method').text(data.errors['deliveryMethods']);
                    }
                    else {
                        $('.invalid-delivery-method').css('display', 'none');
                    }

                    if (data.errors['services']) {
                        $('.invalid-services').css('display', 'block');
                        $('.invalid-services').text(data.errors['services']);
                    }
                    else {
                        $('.invalid-services').css('display', 'none');
                    }
                }
            }
        }
    });
}


$(document).ready(function(){

    $('.save').on('click', validateEditForm);

});