
var validateSecondStep = function(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;

    var paymentMethods = $('.js-pm:checked').map(function(){return $(this).attr('value');});
    var deliveryMethods = $('.js-dm:checked').map(function(){return $(this).attr('value');});
    var services = $('.js-s:checked').map(function(){return $(this).attr('value');});
    var writesTheCheck = $('.js-wtc').attr('checked');
    var orderByEmail = $('.js-obe').attr('checked');

    $('.invalid-payment-method').text('');
    $('.invalid-delivery-method').text('');
    $('.invalid-services').text('');

    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/registration-link/second-step',
        headers: headers,
        data: {
                  'paymentMethods': paymentMethods,
                  'deliveryMethods': deliveryMethods,
                  'services': services,
                  'writesTheCheck': writesTheCheck,
                  'orderByEmail': orderByEmail
              },
        success: function(data) {
            console.log(data);
            if(data.success){
                $('.submit-registration-form').submit();
            }
            else{
                $('.invalid-payment-method').text(data.errors['paymentMethods']);
                $('.invalid-delivery-method').text(data.errors['deliveryMethods']);
                $('.invalid-services').text(data.errors['services']);
            }
        }
    });
}

$(document).ready(function(){

    $('.registration-form').on('click', '.submit-registration-form', validateSecondStep);

});
