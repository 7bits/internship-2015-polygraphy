(function() {
    'use strict';

    var popUpWindow = function (event){
        event.preventDefault();
        $('body').css('overflow', 'hidden');
        $('.b-search__overlay').css('overflow', 'auto');
        $('.b-search__overlay').fadeIn('fast');
        var token = $('meta[name=_csrf]').attr('content');
        var header = $('meta[name=_csrf_header]').attr('content');
        var headers = {};
        headers[header] = token;
        var render = Handlebars.compile($('#pop-up-window-detail').html());
        console.log(this);
        var id = $(this).attr('id');
        var url = '/polygraphy/'+id;
        console.log(url);
        $.ajax({
            type: 'GET',
            dataType: 'json',
            url: url,
            headers: headers,
            success: function(data) {
                $('.b-popup-window').html(render(data.data.polygraphy));
            },
            error:  function(xhr, str){
                alert('Ошибка: ' + xhr.responseCode);
            }
        });
    };

    var jumpToPageOfPolygraphy = function(){
        var id = $(this).attr('id');
        console.log(id);
        window.location.href = '/polygraphy/'+id;
    };


    $(document).ready(function(){

        $('.b-search__polygraphies-list').on('click', '.b-results-item__detail a', popUpWindow);
        $('.b-search__polygraphies-list').on('click', '.b-results-item__name', popUpWindow);

        $(this).on('click', '.b-results-item__adaptive-name', jumpToPageOfPolygraphy);
        $(this).on('click', '.b-results-item__adaptive-detail-info', jumpToPageOfPolygraphy);

        $('.b-search__overlay').click(function(event) {
            if (event.target === this) {
                $('.b-search__overlay').fadeOut('fast');
                $('body').css('overflow', 'auto');
            }
        });

        $(this).keydown(function(e) {
            if( e.keyCode === 27 ) {
                $('.b-search__overlay').fadeOut('fast');
                return false;
            }
        });


        $(this).on('click', '.b-popup-window__close', function(){
            $('.b-search__overlay').fadeOut('fast');
            $('body').css('overflow', 'auto');
        });

        $('.b-dropdown__placeholder').click(function(){
            var placeholderId = $(this).attr('id');
            $('.b-dropdown__list[id='+placeholderId+'-list]').slideToggle();
        });

        $('.b-dropdown__input').change(function(){
            var name = $(this).attr('name');
            var label = $('label[for='+name+'-item-' + $(this).val() + ']').text()
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