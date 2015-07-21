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
