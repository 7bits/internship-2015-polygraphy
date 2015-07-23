/*(function($) {
  console.log("Hello world");
})(jQuery);*/

/*(function($, undefined){
    $(function(){
        $("p").css("color", "#333");
    });
})(jQuery);*/

/*//кликаешь на submit и форма пытается свернуться
$(function(){
    $('button').click(function(){
        $('.search .search-line').next('.filter-field').stop().slideToggle();
    });
});*/

$(function(){
    $('select > option').css("display", "block");
    //$('select > option').css("color", "red");
});

/*$(document).ready(function() {
    $('form').submit(function(){
    // собираешь параметры с формы
    // отправляешь запрос с параметрами
    // рисуешь резльтат
        var msg = $('form').serialize();
        $.ajax({
            url: '/results',
            type: 'POST',
            data: msg,
            success: function(data){
                $('.results').html(data);
            }
        });
        return false;
    });
});*/

function call(event) {
    event.preventDefault();
    var template = Handlebars.compile($('#results').html());
    var msg = $('#form').serialize();
    window.history.pushState('','', 'search?' + msg);
    $.ajax({
        type: 'POST',
        url: '/search',
        data: msg,
        success: function(data) {
            console.log(data);
            var html = template({polygraphies: data.polygraphies,
            polygraphiesListIsNull: data.polygraphiesListIsNull});
            $('#polygraphiesList').html(html);
        },
        error:  function(xhr, str){
              alert('Возникла ошибка: ' + xhr.responseCode);
        }
    });
}

/*
    if(msg=='query='){
        $('button.submit').attr('disabled', true);
    };
*/

$(document).ready(function(){

    $("#form").on('submit', call);

    $("button.submit").click(function(){
        $(".filter-field").slideToggle();
    });

    $("div.hide-show-search").click(function(){
        $(".filter-field").slideToggle();
    });
});
