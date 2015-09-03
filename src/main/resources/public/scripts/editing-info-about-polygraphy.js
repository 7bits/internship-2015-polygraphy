
var validateEditForm = function(){
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;

    var url = $('form').attr('action');

    var names = {}
    $('.input-field').each(function(){
        names[$(this).attr('name')] = $(this).val();
        $(this).css('borderColor', 'white');
        $('.invalid').css('display', 'none');
        $(".for-error").css('display', 'none');
        $('.invalid').text('');
    });

    var checkboxes = {}
    $('.checkbox').each(function(){
        checkboxes[$(this).attr('name')] = [];
    });
    $.each(checkboxes, function(key, value){
        $('.checkbox[name='+key+']:checked').each(function(){
            value.push($(this).attr('value'));
        });
    });

    var textArea = CKEDITOR.instances['text-area-field'].getData();
    var writesTheCheck = $('.js-wtc').prop('checked');
    var orderByEmail = $('.js-obe').prop('checked');

    $('.base-error').css('display', 'none');
    $('.base-error').text('');

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
                'info': textArea,
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
                if (data.errors['base']){
                    $('.base-error').css('display', 'block');
                    $('.base-error').text(data.errors['base']);
                }
                else {
                    $('.base-error').css('display', 'none');

                    $.each(data.errors, function(key, value){
                        $(".input-field[name="+key+"]").css('borderColor', '#FD5D58');
                        $(".for-error#"+key+"-for-error").css('display', 'block');
                        $(".invalid#"+key+"-error").css('display', 'block');
                        $(".invalid#"+key+"-error").text(value);
                    });

                }
            }
        }
    });
};


$(document).ready(function(){

    $('.save').on('click', validateEditForm);

});