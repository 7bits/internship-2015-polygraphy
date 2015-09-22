package it.sevenbits.graphicartsindustry.service;

public class ServiceException extends Exception {
    public ServiceException(String message) {
        super(message);
    }
    public ServiceException(String s, Exception e) {
        super(s, e);
    }
}