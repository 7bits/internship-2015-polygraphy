
var validateSecondStep = function(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr('content');
    var header = $("meta[name='_csrf_header']").attr('content');
    var headers = {};
    headers[header] = token;

    var input = $('.b-registration__input');
    var invalid = $('.b-registration__invalid');
    var forError = $('.b-registration__for-error');

    input.addClass('js-normal-input').removeClass('js-error-input');
    invalid.addClass('js-none-display').removeClass('js-display-block');
    forError.addClass('js-none-display').removeClass('js-display-block');
    invalid.text('');

    CKEDITOR.instances['text-area-field'].updateElement();
    var writesTheCheck = $('.js-wtc').prop('checked');
    var orderByEmail = $('.js-obe').prop('checked');

    /* Поля первого шага */
    var names = {};
    input.each(function(){
        names[$(this).attr('name')] = $(this).val();
    });

    /* Поля второго шага */
    var checkboxes = {};
    $('.b-registration__checkbox').each(function(){
        checkboxes[$(this).attr('name')] = [];
    });
    $.each(checkboxes, function(key, value){
        $('.b-registration__checkbox[name='+key+']:checked').each(function(){
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
                'info': names.textArea,
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
                window.App.displayErrors(data);
            }
        }
    });
};

$(document).ready(function(){

    $('input').attr('autocomplete', 'off');

    $('.b-registration').on('click', '.b-registration__submit', validateSecondStep);

});
