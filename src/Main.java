public class Main {
    public static void main(String[] args) {

        String login = "java_skypro_go";
        String password = "skypro123";
        String confirmPassword = "skypro123";

        try {
            boolean isValid = UserValidation.validateCredentials(login, password, confirmPassword);
            System.out.println("Credentials are valid: " + isValid);
        } catch (WrongLoginException e) {
            System.err.println("Login error: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.err.println("Password error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed.");
        }
    }
}