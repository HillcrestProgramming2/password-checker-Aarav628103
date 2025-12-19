public class CriteriaChecker {

    public boolean[] checkPassword(String password) {
        boolean[] results = new boolean[5];

        // Rule 1: Length >= 8
        results[0] = password.length() >= 8;

        // Rule 2: Contains uppercase
        results[1] = password.matches(".*[A-Z].*");

        // Rule 3: Contains lowercase
        results[2] = password.matches(".*[a-z].*");

        // Rule 4: Contains digit
        results[3] = password.matches(".*[0-9].*");

        // Rule 5: Contains special character
        results[4] = password.matches(".*[!@#$%^&*()\\-_=+<>?/].*");

        return results;
    }
}
