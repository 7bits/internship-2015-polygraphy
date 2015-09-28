package it.sevenbits.graphicartsindustry.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ModelAndView handleResourceNotFoundException() {
        return new ModelAndView("home/404");
    }

    @ExceptionHandler(InternalServerErrorExeption.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ModelAndView handleInternalServerErrorExeption(HttpServletRequest request) {
        Integer status = (Integer) request.getAttribute("javax.servlet.error.status_code");
        return new ModelAndView("home/500");
    }

//    @ExceptionHandler(Exception.class)
//    public ModelAndView handleExeption(HttpServletRequest request, Exception e) {
//        ModelAndView mav = new ModelAndView("home/error");
//        mav.addObject("status", request.getAttribute("javax.servlet.error.status_code"));
//        mav.addObject("reason", request.getAttribute("javax.servlet.error.message"));
//        return mav;
//    }
}
