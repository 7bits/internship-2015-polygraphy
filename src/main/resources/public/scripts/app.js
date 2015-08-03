
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

/*function pop-up-window(event){
    event.preventDefault();
}*/


//$(".payment-method-items").css({display:'none',visibility:'hidden'});
//$(".delivery-method-items").css({display:'none',visibility:'hidden'});

$(document).ready(function(){

    $("#form").on('submit', call);
    $("#form").change(call);

    //$(".detail").click(pop-up-window);

    $("button.submit").click(function(){
        $(".filter-field").slideUp();
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

    $("input.item-selection-payment").click(function(){
        $(".payment-method-items").slideUp("slow");
    });

    $("input.item-selection-delivery").click(function(){
        $(".delivery-method-items").slideUp("slow");
    });

    $("input.item-selection-payment").change(function(){
        var label = $('label[for=item1' + $(this).val() + ']').text()
        $(".payment-placeholder").text(label);
        });

    $("input.item-selection-delivery").change(function(){
        var label = $('label[for=item2' + $(this).val() + ']').text()
        $(".delivery-placeholder").text(label);
        });

});