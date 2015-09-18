$(document).ready(function(){
    $('ul.header__dropdown-menu').hide();
    /*$("ul li:odd").css("background-color", "#efefef");*/
    $('.header__menu-item.header_dropdown').click(function(){
        $('ul.header__dropdown-menu').toggle('fast');
    });
});