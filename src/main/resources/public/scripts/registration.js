
var validateSecondStep = function(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;

    $('.input-field').css('borderColor', 'white');
    $('.invalid').css('display', 'none');
    $(".for-error").css('display', 'none');
    $('.invalid').text('');

    CKEDITOR.instances['text-area-field'].updateElement();
    var writesTheCheck = $('.js-wtc').prop('checked');
    var orderByEmail = $('.js-obe').prop('checked');

    /* Поля первого шага */
    var names = {}
    $('.input-field').each(function(){
        names[$(this).attr('name')] = $(this).val();
    });

    /* Поля второго шага */
    var checkboxes = {}
    $('.checkbox').each(function(){
        checkboxes[$(this).attr('name')] = [];
    });
    $.each(checkboxes, function(key, value){
        $('.checkbox[name='+key+']:checked').each(function(){
            value.push($(this).attr('value'));
        });
    });

    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/registration/second-step',
        headers: headers,
        contentType: 'application/json',
        data: JSON.stringify({
            firstForm: {
                'email': names.email,
                'password': names.password,
                'name': names.name,
                'address': names.address,
                'phone': names.phone,
                'publicEmail': names.publicEmail,
                'website': names.website,
                'info': textArea,
                'hash': names.hash
            },
            secondForm: {
                'paymentMethods': checkboxes.paymentMethods,
                'deliveryMethods': checkboxes.deliveryMethods,
                'services': checkboxes.services,
                'writesTheCheck': writesTheCheck,
                'orderByEmail': orderByEmail
            }
              }),
        success: function(data) {
            if(data.success){
                window.location.href = '/registration-success';
            }
            else{
                displayErrors(data);
            }
        }
    });
}

$(document).ready(function(){

    $('input').attr('autocomplete', 'off');

    $('.registration-form').on('click', '.submit-registration-form', validateSecondStep);

});
