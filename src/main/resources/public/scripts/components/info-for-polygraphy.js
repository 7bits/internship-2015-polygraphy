var validateFormForBid = flight.component(
    function(){
        this.validateForm = function(event){
            event.preventDefault();

            var headers = {'X-CSRF-TOKEN': null};
            $('#general-form').trigger('csrfFunction', [headers]);

            var input = $('.general-input__input[type=text]');
            var invalid = $('.general-input__invalid');
            var forError = $('.general-input__for-error');

            var email = input.val();

            input.addClass('js-normal-input').removeClass('js-error-input');
            invalid.addClass('js-none-display').removeClass('js-display-block');
            forError.addClass('js-none-display').removeClass('js-display-block');
            invalid.text('');

            $.ajax({
                type: 'POST',
                dataType: 'json',
                url: '/info-for-polygraphy',
                headers: headers,
                data: {'email': email},
                success: function(data) {
                    if(data.success){
                        window.location.href = '/info-for-polygraphy-success';
                    }
                    else{
                        //window.App.displayErrors(data);
                        $('#general-form').trigger('showErrors', data);
                    }
                }
            });
        };

        this.pressEnter = function(event){
            if (event.keyCode === 13){
                event.preventDefault();
            }
        };

        this.after('initialize', function(){
            this.$node.find('input').attr('autocomplete', 'off');
            this.$node.find('.general-submit[id=submit-email]').on('click', this.validateForm);
            this.$node.bind('keypress', this.pressEnter);
        });

    }
);