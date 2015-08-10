
var validateRegistrationForm = function(event){
    event.preventDefault();
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var headers = {};
    headers[header] = token;

    var email = $('#email-input').val();
    var password = $('#password-input').val();
    var name = $('#name-input').val();
    var address = $('#address-input').val();
    var phone = $('#phone-input').val();
    var publicEmail = $('#email-public-input').val();
    var website = $('#website-input').val();
    var textArea = $('#text-area-field').val();

    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: '/registration-link',
        headers: headers,
        data: {
                'email': email,
                'password': password,
                'name': name,
                'address': address,
                'phone': phone,
                'publicEmail': publicEmail,
                'website': website,
                'textArea': textArea
              },
        success: function(data) {
            if(data.success){
                //применяем действие по умолчанию для кнопки "Следующий шаг"
                $('.next').click();
            }
            else{
                for(var e in data.errors)
                    $('.error-container').text(data.errors[e]);
            }
        }
    });
}

$(document).ready(function(){

    $('.next').click(validateRegistrationForm);

});