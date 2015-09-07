var displayErrors = function(data){
    if (data.errors['base']){
        $('.base-error').css('display', 'block');
        $('.base-error').text(data.errors['base']);
    }
    else {
        $('.base-error').css('display', 'none');

        $.each(data.errors, function(key, value){
            $('.input-field[name='+key+']').css('borderColor', '#FD5D58');
            $('.for-error#'+key+'-for-error').css('display', 'block');
            $('.invalid#'+key+'-error').css('display', 'block');
            $('.invalid#'+key+'-error').text(value);
        });
    }
};