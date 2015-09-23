package it.sevenbits.graphicartsindustry.web.controllers;

//@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServerErrorExeption extends RuntimeException {

    public InternalServerErrorExeption(String message, Exception e) {
        super(message, e);
    }
}
