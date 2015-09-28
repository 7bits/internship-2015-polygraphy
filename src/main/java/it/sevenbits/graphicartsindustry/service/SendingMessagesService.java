package it.sevenbits.graphicartsindustry.service;

import de.neuland.jade4j.JadeConfiguration;
import de.neuland.jade4j.template.JadeTemplate;
import it.sevenbits.graphicartsindustry.web.view.RequestOnRegistrationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.HashMap;

@Service
public class SendingMessagesService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private JadeConfiguration jade;

    @Autowired
    private RequestOnRegistrationService requestOnRegistrationService;

    @Autowired
    SendingMessagesService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @ResponseStatus(HttpStatus.CREATED)
    public void sendingRegistrationLink(RequestOnRegistrationModel requestOnRegistrationModel) throws MessagingException, ServiceException, IOException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = null;

        JadeTemplate template = jade.getTemplate("home/letter");
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("link", requestOnRegistrationModel.getLink());
        String html = jade.renderTemplate(template, model);

        helper = new MimeMessageHelper(message, true,"UTF-8");
        helper.setFrom("polygraphy.polygraphy@gmail.com");
        helper.setTo(requestOnRegistrationModel.getEmail());
        helper.setSubject("Message with link on registration ");
        helper.setText(html, true);

        javaMailSender.send(message);
    }
}
