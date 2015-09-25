package it.sevenbits.graphicartsindustry.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ModelAndView handleResourceNotFoundException() {
        return new ModelAndView("home/404");
    }

    @ExceptionHandler(InternalServerErrorExeption.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ModelAndView handleInternalServerErrorExeption(InternalServerErrorExeption e) {
        ModelAndView mav = new ModelAndView("home/500");
        mav.addObject("message", e.getMessage());
        return mav;
    }
}
