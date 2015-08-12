package it.sevenbits.graphicartsindustry.web.domain.registration;

public class RegistrationForm {
    private RegistrationFirstForm firstStepForm;
    private RegistrationSecondForm secondStepForm;

    public RegistrationFirstForm getFirstStepForm() {
        return firstStepForm;
    }

    public void setFirstStepForm(RegistrationFirstForm firstStepForm) {
        this.firstStepForm = firstStepForm;
    }

    public RegistrationSecondForm getSecondStepForm() {
        return secondStepForm;
    }

    public void setSecondStepForm(RegistrationSecondForm secondStepForm) {
        this.secondStepForm = secondStepForm;
    }
}
