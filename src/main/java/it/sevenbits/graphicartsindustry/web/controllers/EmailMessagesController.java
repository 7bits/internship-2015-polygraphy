//package it.sevenbits.graphicartsindustry.web.controllers;
//
//import it.sevenbits.graphicartsindustry.web.domain.request.RequestOnRegistrationModel;
//import it.sevenbits.graphicartsindustry.web.service.ServiceException;
//import it.sevenbits.graphicartsindustry.web.service.request.RequestOnRegistrationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//
//@RestController
//public class EmailMessagesController {
//    private final JavaMailSender javaMailSender;
//
//    @Autowired
//    private RequestOnRegistrationService requestOnRegistrationService;
//
//    @Autowired
//    EmailMessagesController(JavaMailSender javaMailSender) {
//        this.javaMailSender = javaMailSender;
//    }
//
//    @ResponseStatus(HttpStatus.CREATED)
//    public void sendingRegistrationLink(int requestId) throws MessagingException, ServiceException {
//        MimeMessage message = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper = null;
//
//        RequestOnRegistrationModel request =
//                requestOnRegistrationService.findRequestOnRegistrationById(requestId);
//
//        helper = new MimeMessageHelper(message, true,"UTF-8");
//        helper.setFrom("anastasia.lyubich@gmail.com");
//        helper.setTo("anastasia.lyubich@gmail.com");
//        helper.setSubject("Message with link on registration "
//                + request.getEmail());
//        helper.setText("<>" + request.getLink(), true);
//
//        javaMailSender.send(message);
//    }
//}
