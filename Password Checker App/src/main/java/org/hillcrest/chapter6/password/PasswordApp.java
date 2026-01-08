package org.hillcrest.chapter6.password;

import java.util.Scanner;

public class PasswordApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password to check its strength:");
        String password = scanner.nextLine();

        // Check criteria
        CriteriaChecker checker = new CriteriaChecker();
        boolean[] results = checker.checkPassword(password);

        // Generate feedback
        FeedbackGenerator feedback = new FeedbackGenerator();
        String feedbackMessage = feedback.generateFeedback(results);

        // Display results
        System.out.println("\nPassword Strength Feedback:");
        System.out.println(feedbackMessage);

        scanner.close();
    }
}

