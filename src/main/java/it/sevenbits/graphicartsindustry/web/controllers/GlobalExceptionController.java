package it.sevenbits.graphicartsindustry.web.controllers;

import it.sevenbits.graphicartsindustry.web.exception.InternalServerErrorException;
import it.sevenbits.graphicartsindustry.web.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(NotFoundException.class)
    public ModelAndView handleResourceNotFoundException() {
        return new ModelAndView("home/404");
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ModelAndView handleInternalServerErrorExeption() {
        return new ModelAndView("home/500");
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleExeption(HttpServletRequest request) {
        Integer status = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (status == null)
            return new ModelAndView("home/404");
        return new ModelAndView("home/500");
    }
}
