class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}
public class UserValidation {

    // Метод проверки учетных данных
    public static boolean validateCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        // Проверка логина
        if (login == null || login.isEmpty()) {
            throw new WrongLoginException("Login cannot be empty");
        }

        if (login.length() > 20) {
            throw new WrongLoginException("Login cannot be longer than 20 characters");
        }

        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Login can only contain letters, digits, and underscores");
        }

        // Проверка пароля
        if (password == null || password.isEmpty()) {
            throw new WrongPasswordException("Password cannot be empty");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirm password do not match");
        }

        return true;
    }
}