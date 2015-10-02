package it.sevenbits.graphicartsindustry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageByLocaleService {

    @Autowired
    private MessageSource messageSource;

    public String getMessage(String messageId) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(messageId, null, locale);
    }
}