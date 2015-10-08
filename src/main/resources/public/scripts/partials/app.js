(function() {
    'use strict';

    $(document).ready(function(){

        $('.b-dropdown__placeholder').click(function(){
            var placeholderId = $(this).attr('id');
            $('.b-dropdown__list[id='+placeholderId+'-list]').slideToggle();
        });

        $('.b-dropdown__input').change(function(){
            var name = $(this).attr('name');
            var label = $('label[for='+name+'-item-' + $(this).val() + ']').text();
            $('.b-dropdown__placeholder[id='+name+']').text(label);
            $('.b-dropdown__list[id='+name+'-list]').slideUp('slow');
        });

            var paymentMethodPlaceholder = $('label[for=paymentMethod-item-' + $('.b-dropdown__input[name=paymentMethod]:checked').attr('value') + ']').text();
            $('.b-dropdown__placeholder[id=paymentMethod]').text(paymentMethodPlaceholder);

            var deliveryMethodPlaceholder = $('label[for=deliveryMethod-item-' + $('.b-dropdown__input[name=deliveryMethod]:checked').attr('value') + ']').text();
            $('.b-dropdown__placeholder[id=deliveryMethod]').text(deliveryMethodPlaceholder);

        $('input').attr('autocomplete', 'off');

    });
})();