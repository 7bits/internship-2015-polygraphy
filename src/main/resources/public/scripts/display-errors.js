var displayErrors = function(data){
    var className = $('#big-form').attr('class');
    var baseError = $('.'+className+'__base-error');

    if (data.errors['base']){
        baseError.addClass('js-display-block');
        baseError.text(data.errors['base']);
    }
    else {
        baseError.addClass('js-none-display');

        $.each(data.errors, function(key, value){
            $('.'+className+'__input[name='+key+']').addClass('js-error-input');
            $('.'+className+'__for-error#'+key+'-for-error').addClass('js-display-block');
            $('.'+className+'__invalid#'+key+'-error').addClass('js-display-block');
            $('.'+className+'__invalid#'+key+'-error').text(value);
        });
    }
};