(function() {
    'use strict';

    function liveSearch() {
        var token = $('meta[name=_csrf]').attr('content');
        var header = $('meta[name=_csrf_header]').attr('content');
        var headers = {};
        headers[header] = token;

        var template = Handlebars.compile($('#results').html());
        var msg = $('#search-form').serialize();
        window.history.pushState('','', 'search?' + msg);
        $('.b-search__js-loader').css('visibility', 'visible');
        $.ajax({
            type: 'POST',
            url: '/search',
            data: msg,
            headers: headers,
            success: function(data) {
                console.log(data);
                var html = template({
                    polygraphies: data.polygraphies,
                    polygraphiesListIsNull: data.polygraphiesListIsNull
                });
                $('.b-search__polygraphies-list').html(html);
                $('.b-search__js-loader').css('visibility', 'hidden');
            },
            error:  function(xhr, str){
                console.log(arguments);
                alert('Возникла ошибка: ' + xhr.responseCode);
                $('.b-search__js-loader').css('visibility', 'visible');
            }
        });
    }


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
                $('.b-popup-window').html(render(data));
            },
            error:  function(xhr, str){
                //console.log(arguments);
                alert('Ошибка: ' + xhr.responseCode);
            }
        });
    };

    var scrollUpWindow = function(){
        if ( $(document).scrollTop() > 0 ) {
            $('.b-search__button-up').fadeIn('fast');
        } else {
            $('.b-search__button-up').fadeOut('fast');
        }
    };

    var delay = (function(){
        var timer = 0;
        return function(callback, ms){
            clearTimeout (timer);
            timer = setTimeout(callback, ms);
        };
    })();

    var jumpToPageOfPolygraphy = function(){
        var id = $(this).attr('id');
        console.log(id);
        window.location.href = '/polygraphy/'+id;
    };


    $(document).ready(function(){

        if ($('.b-search__polygraphies-list').length) {
            liveSearch();
        }

        $('#search-form').on('submit', liveSearch);
        $('#search-form').change(liveSearch);

        $('#search-form').bind('keypress', function(e) {
            if (e.keyCode == 13) {
                e.preventDefault();
                liveSearch();
                return false;
            }
        });

        $('.b-search__polygraphies-list').on('click', '.b-results-item__detail a', popUpWindow);
        $('.b-search__polygraphies-list').on('click', '.b-results-item__name', popUpWindow);

        $(this).on('click', '.b-results-item__adaptive-name', jumpToPageOfPolygraphy);
        $(this).on('click', '.b-results-item__adaptive-detail-info', jumpToPageOfPolygraphy);

        $('.b-search__overlay').click(function(event) {
            event || window.event
            if (event.target == this) {
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
            var id = $(this).attr('id');
            $('.b-dropdown__list[id='+id+'-list]').slideToggle();
        });

        $('.b-dropdown__input').click(function(){
            var name = $(this).attr('name');
            $('.b-dropdown__list[id='+name+'-list]').slideUp('slow');
        });

        $('.b-dropdown__input').change(function(){
            var name = $(this).attr('name');
            var label = $('label[for='+name+'-item-' + $(this).val() + ']').text()
            $('.b-dropdown__placeholder[id='+name+']').text(label);
        });

        $('.b-search__button-up').mouseover(function(){
            $(this).animate({opacity: 1}, 100);
        }).mouseout(function(){
            $(this).animate({opacity: 0.5}, 100);
        });

        $('.b-search__button-up').click(function(){
            $('body,html').animate({scrollTop: 0}, 400);
            return false;
        });

        if ($(document).width() > 1024){
            $(window).scroll(scrollUpWindow);
        }

        $('.b-search-line__input').keyup(function() {
            delay(liveSearch, 1500);
        });

        $('input').attr('autocomplete', 'off');

        $('.b-dropdown__placeholder').text(
            $('label[for=paymentMethod-item-' + $('.b-dropdown__input:checked').attr('value') + ']').text()
        );

        $('.b-dropdown__placeholder').text(
            $('label[for=deliveryMethod-item-' + $('.b-dropdown__input:checked').attr('value') + ']').text()
        );

    });
})();