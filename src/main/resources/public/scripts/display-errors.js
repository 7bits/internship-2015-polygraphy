var displayErrors = function(data){
    if (data.errors['base']){
        $('.b-registration__base-error').css('display', 'block');
        $('.b-registration__base-error').text(data.errors['base']);
    }
    else {
        $('.b-registration__base-error').css('display', 'none');

        $.each(data.errors, function(key, value){
            $('.b-registration__input[name='+key+']').css('borderColor', '#FD5D58');
            $('.b-registration__for-error#'+key+'-for-error').css('display', 'block');
            $('.b-registration__invalid#'+key+'-error').css('display', 'block');
            $('.b-registration__invalid#'+key+'-error').text(value);
        });
    }
};