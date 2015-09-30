var displayErrors = flight.component(
    function() {
        this.showErrors = function(e, data){
            var className = $('.general-input').attr('class').split(' ')[0];
            var baseError = $('.general-form__base-error');

            if (data.errors['base']){
                baseError.removeClass('js-none-display').addClass('js-display-block');
                baseError.text(data.errors['base']);
            }
            else {
                baseError.removeClass('js-display-block').addClass('js-none-display');

                $.each(data.errors, function(key, value){
                    $('.'+className+'__input[name='+key+']').removeClass('js-normal-input').addClass('js-error-input');
                    $('.'+className+'__for-error#'+key+'-for-error').removeClass('js-none-display').addClass('js-display-block');
                    $('.'+className+'__invalid#'+key+'-error').removeClass('js-none-display').addClass('js-display-block');
                    $('.'+className+'__invalid#'+key+'-error').text(value);
                });
            }
        };

        this.after('initialize', function(){
            this.on('showErrors', this.showErrors);
        });
    }
);