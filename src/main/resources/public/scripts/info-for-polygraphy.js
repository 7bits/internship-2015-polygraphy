
var validateForm = function(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;
    var email = $('input.email-input').val();
    var formId = $(this).attr('form');
    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/info-for-polygraphy',
        headers: headers,
        data: {'email': email},
        success: function(data) {
            if(data.success){
                $('button[form='+formId+']').submit();
            }
            else{
                for(var e in data.errors)
                    $('.error-container').text(data.errors[e]);
            }
        }
        });
}

$(document).ready(function(){

    $('button.submit-email[type=submit]').click(validateForm);

});