package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if ((password != null) && (repeatPassword != null)) {
            if (!(password.equals(repeatPassword)) || password.length() < MIN_PASSWORD_LENGTH) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
