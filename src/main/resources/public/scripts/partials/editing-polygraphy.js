
var validateEditForm = function(){
    var token = $("meta[name='_csrf']").attr('content');
    var header = $("meta[name='_csrf_header']").attr('content');
    var headers = {};
    headers[header] = token;

    var url = $('form').attr('action');

    CKEDITOR.instances['text-area-field'].updateElement();
    var writesTheCheck = $('.js-wtc').prop('checked');
    var orderByEmail = $('.js-obe').prop('checked');

    var input = $('.b-edit__input');
    var invalid = $('.b-edit__invalid');
    var forError = $('.b-edit__for-error');
    var baseError = $('.b-edit__base-error');

    var names = {};
    input.each(function(){
        names[$(this).attr('name')] = $(this).val();
        $(this).addClass('js-normal-input').removeClass('js-error-input');
        invalid.addClass('js-none-display').removeClass('js-display-block');
        forError.addClass('js-none-display').removeClass('js-display-block');
        invalid.text('');
    });

    var checkboxes = {};
    $('.b-edit__checkbox').each(function(){
        checkboxes[$(this).attr('name')] = [];
    });
    $.each(checkboxes, function(key, value){
        $('.b-edit__checkbox[name='+key+']:checked').each(function(){
            value.push($(this).attr('value'));
        });
    });

    baseError.addClass('js-none-display');
    baseError.text('');

    $.ajax({
        type: 'PUT',
        dataType: 'json',
        url: url,
        headers: headers,
        contentType: 'application/json',
        data: JSON.stringify({
                'polygraphyId': names.polygraphyId,
                'email': names.email,
                'password': names.password,
                'name': names.name,
                'address': names.address,
                'phone': names.phone,
                'publicEmail': names.publicEmail,
                'website': names.website,
                'info': names.textArea,
                'paymentMethods': checkboxes.paymentMethods,
                'deliveryMethods': checkboxes.deliveryMethods,
                'services': checkboxes.services,
                'writesTheCheck': writesTheCheck,
                'orderByEmail': orderByEmail
        }),
        success: function(data) {

            if(data.success){
                window.location.href = '/success-editing';
            }
            else{
                window.App.displayErrors(data);
            }
        }
    });
};


$(document).ready(function(){

    $('.b-edit__save').on('click', validateEditForm);

});