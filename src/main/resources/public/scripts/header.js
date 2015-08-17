$(document).ready(function(){

    $("li.list").click(function(){
        $(".list-item").css('visibility','visible');
    });

    $(document).mouseup(function (e){
        var div = $(".list-item");
        if (!div.is(e.target)                           // если клик был не по нашему блоку
            && div.has(e.target).length === 0) {        // и не по его дочерним элементам
        div.css('visibility','hidden');                 // скрываем его
        }
    });

});