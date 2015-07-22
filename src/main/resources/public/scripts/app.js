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

$(document).ready(function() {
    $('form').submit(function(){
    // собираешь параметры с формы
    // отправляешь запрос с параметрами
    // рисуешь резльтат
        $.ajax({
            url: '/results',
            type: 'POST',
            dataType: 'html',
            //data: '.results',
            success: function(data){
                $('.results').html(data)
            }
        });
        return false;
    });
});

$(document).ready(function(){
    $("button.submit").click(function(){
        $(".search").slideUp("slow")(function(){
            $(".logo").click(function(){
                $(".search").slideDown("slow");
            });
        });
    });
});
