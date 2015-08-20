package it.sevenbits.graphicartsindustry.web.service;

import it.sevenbits.graphicartsindustry.web.domain.request.RequestOnRegistrationModel;
import it.sevenbits.graphicartsindustry.web.service.request.RequestOnRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class SendingMessagesService {
    private final JavaMailSender javaMailSender;

    @Autowired
    private RequestOnRegistrationService requestOnRegistrationService;

    @Autowired
    SendingMessagesService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @ResponseStatus(HttpStatus.CREATED)
    public void sendingRegistrationLink(int requestId) throws MessagingException, ServiceException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = null;

        RequestOnRegistrationModel request =
                requestOnRegistrationService.findRequestOnRegistrationById(requestId);

        helper = new MimeMessageHelper(message, true,"UTF-8");
        helper.setFrom("polygraphy.polygraphy@gmail.com");
        helper.setTo("polygraphy.polygraphy@gmail.com");
        helper.setSubject("Message with link on registration "
                + request.getEmail());
        helper.setText("<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <link rel=\"stylesheet\" href=\"http://polygraphy.7bits.it/stylesheets/osans.css\">\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div style=\"width: 800px; height: 600px; background-color: white; box-sizing: border-box; padding: auto 50px;\" class=\"wrapper\">\n" +
                "      <div style=\"height: 170px; width: 100%; background-image: url('http://polygraphy.7bits.it/images/logo.png'); background-position: center center; background-repeat: no-repeat;\" class=\"logo-box\"></div>\n" +
                "      <div style=\"width: 733px; height: 300px; font-family: &quot;OpenSansLightRegular&quot;; background-color: rgb(232,232,232); border-radius: 10px; border: none; outline: none; margin: auto; padding: 50px; box-sizing: border-box; text-align: center; line-height: 30px; font-size: 20px;\" class=\"content-box\">\n" +
                "        <div style=\"display: block; width: 100%; height: auto;\" class=\"text\">" +
                "           Здравствуйте! " +
                "           <br> Вы оставили свою заявку на регистрацию полиграфии. Для того, " +
                "           <br> чтобы Ваша полиграфия появилась в поиске на сайте " +
                "           <br> <a href=\"http://polygraphy.7bits.it/\" style=\"color: #64be5f;\">polygraphy.7bits.it</a>, пожалуйста, заполните информацию о ней." +
                "        </div>\n" +
                "        <div style=\"display: block; width: 100%; height: auto; margin: 30px auto;\" class=\"link\"><a href=\""+request.getLink()+"\" style=\" text-decoration: none; color: white; line-height: 40px; background-color: #64be5f; border: none; outline: none; border-radius: 25px; padding: 10px 30px;\">" +
                "           Заполнить информацию</a>" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>", true);

        javaMailSender.send(message);
    }
}
