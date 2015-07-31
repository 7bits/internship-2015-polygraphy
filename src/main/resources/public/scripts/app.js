
function call(event) {
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;
    var template = Handlebars.compile($('#results').html());
    var msg = $('#form').serialize();
    window.history.pushState('','', 'search?' + msg);
    $.ajax({
        type: 'POST',
        url: '/search',
        data: msg,
        headers: headers,
        success: function(data) {
            console.log(data);
            var html = template({polygraphies: data.polygraphies,
            polygraphiesListIsNull: data.polygraphiesListIsNull});
            $('#polygraphiesList').html(html);
        },
        error:  function(xhr, str){
                console.log(arguments);
              alert('Возникла ошибка: ' + xhr.responseCode);
        }
    });
}

$(document).ready(function(){

    $("#form").on('submit', call);
    $("#form1").on('submit', call);

    $("button.submit").click(function(){
        $(".filter-field").slideUp();
    });

    $("div.hide-show-search").click(function(){
        $(".filter-field").slideToggle();
    });

});