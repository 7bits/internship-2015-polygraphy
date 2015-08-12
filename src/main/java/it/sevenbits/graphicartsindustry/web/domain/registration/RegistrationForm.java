package it.sevenbits.graphicartsindustry.web.domain.registration;

public class RegistrationForm {
    private RegistrationFirstForm firstForm;
    private RegistrationSecondForm secondForm;

    public RegistrationFirstForm getFirstForm() {
        return firstForm;
    }

    public void setFirstForm(RegistrationFirstForm firstForm) {
        this.firstForm = firstForm;
    }

    public RegistrationSecondForm getSecondForm() {
        return secondForm;
    }

    public void setSecondForm(RegistrationSecondForm secondForm) {
        this.secondForm = secondForm;
    }
}
