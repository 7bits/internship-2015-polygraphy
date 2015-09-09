var displayErrors = function(data){
    var className = $('#big-form').attr('class');
    if (data.errors['base']){
        $('.'+className+'__base-error').css('display', 'block');
        $('.'+className+'__base-error').text(data.errors['base']);
    }
    else {
        $('.'+className+'__base-error').css('display', 'none');

        $.each(data.errors, function(key, value){
            $('.'+className+'__input[name='+key+']').css('borderColor', '#FD5D58');
            $('.'+className+'__for-error#'+key+'-for-error').css('display', 'block');
            $('.'+className+'__invalid#'+key+'-error').css('display', 'block');
            $('.'+className+'__invalid#'+key+'-error').text(value);
        });
    }
};