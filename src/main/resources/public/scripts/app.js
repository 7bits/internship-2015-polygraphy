
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

$(document).ready(function(){

    $("#form").on('submit', call);

    $("button.submit").click(function(){
        $(".filter-field").slideUp();
    });

    $("div.hide-show-search").click(function(){
        $(".filter-field").slideToggle();
    });

    /*$("input:radio").bind("change click", function () {
        $(this).parent().css("backgroundColor", "#f3e642");
    });*/
});