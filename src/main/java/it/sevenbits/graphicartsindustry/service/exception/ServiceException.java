package it.sevenbits.graphicartsindustry.service.exception;

public class ServiceException extends Exception {
    public ServiceException(String message) {
        super(message);
    }
    public ServiceException(String s, Exception e) {
        super(s, e);
    }
}