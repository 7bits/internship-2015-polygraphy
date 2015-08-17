/*function liveSearchResults(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;

    var oftenSeek = [];
    $('.often-seek:checked').each( function(i){ oftenSeek.push($(this).attr("value")) } );
    var paymentMethod = $('.item-selection-payment:checked').attr('value');
    var deliveryMethod = $('.item-selection-delivery:checked').attr('value');
    var writesTheCheck = $('.js-write-the-check').prop('checked');
    var orderByEmail = $('.js-order-by-email').prop('checked');

    *//* *******************************************************************
        На сервер придут данные:
            1. oftenSeek - "часто ищут" - список выбранных чекбоксов
            2. paymentMethod - id выбранного способа оплаты (одно число)
            3. deliveryMethod - id выбранного способа доставки (одно число)
            4. writesTheCheck - "выдает чек" - true или false
            5. orderByEmail - "принимает заказ по e-mail" - true или false
    ******************************************************************** *//*

    var template = Handlebars.compile($('#results').html());

    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/search',
        data:{
            'oftenSeek': oftenSeek,
            'paymentMethod': paymentMethod,
            'deliveryMethod': deliveryMethod,
            'writesTheCheck': writesTheCheck,
            'orderByEmail': orderByEmail
        },
        contentType: 'application/json',
        headers: headers,
        success: function(data){
            var html = template({
                polygraphies: data.polygraphies,
                polygraphiesListIsNull: data.polygraphiesListIsNull
            });
            $('#polygraphies-list').html(html);
        }
    });

}*/

function liveSearchResults() {
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;
    var template = Handlebars.compile($('#results').html());
    var msg = $('#form').serialize();
    window.history.pushState('','', 'search?' + msg);
    $('.js-overlay').css('visibility', 'visible');
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
            $('#polygraphies-list').html(html);
            $('.js-overlay').css('visibility', 'hidden');
        },
        error:  function(xhr, str){
            console.log(arguments);
            alert('Возникла ошибка: ' + xhr.responseCode);
            $('.js-overlay').css('visibility', 'visible');
        }
    });
}


var popUpWindow = function (event){
    event.preventDefault();
    $('body').css('overflow', 'hidden');
    $('.pop-up-overlay').css('overflow', 'auto');
    $('.pop-up-overlay').fadeIn("fast");
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
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
            $('.pop-up-window').html(render(data));
        },
        error:  function(xhr, str){
                //console.log(arguments);
              alert('Ошибка: ' + xhr.responseCode);
        }
    });
}

var scrollUpWindow = function(){
    if ( $(document).scrollTop() > 0 ) {
        $('.up').fadeIn('fast');
    } else {
        $('.up').fadeOut('fast');
    }
};

var delay = (function(){
    var timer = 0;
    return function(callback, ms){
        clearTimeout (timer);
        timer = setTimeout(callback, ms);
    };
})();


$(document).ready(function(){

    $("#form").on('submit', liveSearchResults);
    $("#form").change(liveSearchResults);

    $(".help").on("click", ".detail a", popUpWindow);
    $(".help").on("click", ".polygraphy-name", popUpWindow);

    $('.pop-up-overlay').click(function(event) {
        event || window.event
        if (event.target == this) {
            $('.pop-up-overlay').fadeOut("fast");
            $('body').css('overflow', 'auto');
        }
    });

    $(this).keydown(function(e) {
        if( e.keyCode === 27 ) {
            $('.pop-up-overlay').fadeOut("fast");
            return false;
        }
    });

    $('#form').bind("keypress", function(e) {
        if (e.keyCode == 13) {
            e.preventDefault();
            liveSearchResults();
            return false;
        }
    });

    $(this).on("click", ".close", function(){
        $('.pop-up-overlay').fadeOut("fast");
        $('body').css('overflow', 'auto');
    });

    $("div.hide-show-search").click(function(){
        $(".filter-field").slideToggle();
    });

    $(".payment-placeholder").click(function(){
        $(".payment-method-items").slideToggle();
    });

    $(".delivery-placeholder").click(function(){
        $(".delivery-method-items").slideToggle();
    });

    $(".item-selection-payment").click(function(){
        $(".payment-method-items").slideUp("slow");
    });

    $(".item-selection-delivery").click(function(){
        $(".delivery-method-items").slideUp("slow");
    });

    $(".item-selection-payment").change(function(){
        var label = $('label[for=item1' + $(this).val() + ']').text()
        $(".payment-placeholder").text(label);
    });

    $(".item-selection-delivery").change(function(){
        var label = $('label[for=item2' + $(this).val() + ']').text()
        $(".delivery-placeholder").text(label);
    });

    $(".up").mouseover(function(){
        $(this).animate({opacity: 1}, 100);
    }).mouseout(function(){
        $(this).animate({opacity: 0.5}, 100);
    });

    $('.up').click(function(){
        $('body,html').animate({scrollTop: 0}, 400);
        return false;
    });

    if ($(document).width() > 320){
        $(window).scroll(scrollUpWindow);
    }

    $('.search-field').keyup(function() {
        delay(liveSearchResults, 1500);
    });

    $('input').attr('autocomplete', 'off');

    $(".payment-placeholder").text(
        $('label[for=item1' + $(".item-selection-payment:checked").attr('value') + ']').text()
    );

    $(".delivery-placeholder").text(
        $('label[for=item2' + $(".item-selection-delivery:checked").attr('value') + ']').text()
    );

});