package it.sevenbits.graphicartsindustry.service;

import it.sevenbits.graphicartsindustry.web.view.RequestOnRegistrationModel;
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
    public void sendingRegistrationLink(RequestOnRegistrationModel requestOnRegistrationModel) throws MessagingException, ServiceException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = null;

        helper = new MimeMessageHelper(message, true,"UTF-8");
        helper.setFrom("polygraphy.polygraphy@gmail.com");
        helper.setTo(requestOnRegistrationModel.getEmail());
        helper.setSubject("Message with link on registration ");
        helper.setText("<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div style=\"width: 800px; height: 600px; background-color: white; box-sizing: border-box; padding: 0px 50px;\" class=\"wrapper\">\n" +
                "      <div style=\"height: 170px; width: 100%; background: white url('http://polygraphy.7bits.it/images/logo.png') no-repeat center;\" class=\"logo-box\"></div>\n" +
                "      <div style=\"width: 700px; font-family: 'Arial'; background-color: rgb(232,232,232); border-radius: 10px; border: none; outline: none; margin: auto; padding: 50px; box-sizing: border-box; text-align: center; line-height: 30px; font-size: 20px;\" class=\"content-box\">\n" +
                "        <div style=\"display: block; width: 100%;\" class=\"text\">\n" +
                "            <p style=\"margin: 0px;\"> Здравствуйте!</p> \n" +
                "            <br> Вы оставили свою заявку на регистрацию полиграфии. Для того, \n" +
                "            <br>чтобы Ваша полиграфия появилась в поиске на сайте \n" +
                "            <br> \n" +
                "            <a href=\"http://polygraphy.7bits.it/\" style=\"color: #64be5f;\"> \n" +
                "                 polygraphy.7bits.it\n" +
                "            </a> , пожалуйста, заполните информацию о ней.\n" +
                "        </div>\n" +
                "        <div style=\"display: block; width: 100%; height: auto; margin-top: 30px;\" class=\"link\">\n" +
                "            <a href=\"" + requestOnRegistrationModel.getLink() + "\" style=\" text-decoration: none; color: white; line-height: 40px; background-color: #64be5f; border: none; outline: none; border-radius: 25px; padding: 10px 30px;\">\n" +
                "                Заполнить информацию\n" +
                "            </a>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>", true);

        javaMailSender.send(message);
    }
}
