
function liveSearchResults(event) {
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
            var html = template({
                polygraphies: data.polygraphies,
                polygraphiesListIsNull: data.polygraphiesListIsNull
            });
            $('#polygraphies-list').html(html);
        },
        error:  function(xhr, str){
                console.log(arguments);
              alert('Возникла ошибка: ' + xhr.responseCode);
        }
    });
}

var popUpWindow = function (event){
    event.preventDefault();
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


//$(".payment-method-items").css({display:'none',visibility:'hidden'});
//$(".delivery-method-items").css({display:'none',visibility:'hidden'});

$(document).ready(function(){

    $("#form").on('submit', liveSearchResults);
    $("#form").change(liveSearchResults);

    $(".help").on("click", ".detail a", popUpWindow);

    $('.pop-up-overlay').click(function(event) {
        event || window.event
        if (event.target == this) {
            $('.pop-up-overlay').fadeOut("fast");
        }
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

});