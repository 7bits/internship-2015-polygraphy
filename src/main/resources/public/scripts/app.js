$(function(){
    //$('select > option').css("display", "block");
});

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