var displayErrors = flight.component(
    function() {
        this.showError = function(e, data){
            var className = $('#big-form').attr('class')/*.split(' ')[0]*/;
            var baseError = $('.'+className+'__base-error');

            if (data.errors['base']){
                baseError.addClass('js-display-block');
                baseError.text(data.errors['base']);
            }
            else {
                baseError.addClass('js-none-display');

                $.each(data.errors, function(key, value){
                    $('.'+className+'__input[name='+key+']').removeClass('js-normal-input').addClass('js-error-input');
                    $('.'+className+'__for-error#'+key+'-for-error').removeClass('js-none-display').addClass('js-display-block');
                    $('.'+className+'__invalid#'+key+'-error').removeClass('js-none-display').addClass('js-display-block');
                    $('.'+className+'__invalid#'+key+'-error').text(value);
                });
            }
        };

        this.after('initialize', function(){
            this.on('callErrorsHandler', this.showError)
        })
    }
);