$(document).ready(function(){

    $("li.list").mouseenter(function(){
        $(".list-item").css('visibility','visible');
    });

    $("li.list").mouseleave(function(){
            $(".list-item").css('visibility','hidden');
        });

});