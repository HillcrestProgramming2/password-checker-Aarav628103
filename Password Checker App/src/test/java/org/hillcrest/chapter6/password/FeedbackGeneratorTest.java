package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FeedbackGeneratorTest {

    private final FeedbackGenerator generator = new FeedbackGenerator();

    @Test
    void testStrongPasswordFeedback() {
        boolean[] results = {true, true, true, true, true};
        String feedback = generator.generateFeedback(results);

        assertEquals("Strong password! Well done.", feedback);
    }

    @Test
    void testWeakPasswordFeedback() {
        boolean[] results = {false, false, false, false, false};
        String feedback = generator.generateFeedback(results);

        assertTrue(feedback.contains("Weak password"));
        assertTrue(feedback.contains("Use at least 8 characters"));
        assertTrue(feedback.contains("Add at least one uppercase letter"));
        assertTrue(feedback.contains("Add at least one lowercase letter"));
        assertTrue(feedback.contains("Include at least one digit"));
        assertTrue(feedback.contains("Include at least one special character"));
    }

    @Test
    void testPartialFeedback() {
        boolean[] results = {true, false, true, false, true};
        String feedback = generator.generateFeedback(results);

        assertFalse(feedback.contains("Use at least 8 characters"));
        assertTrue(feedback.contains("Add at least one uppercase letter"));
        assertTrue(feedback.contains("Include at least one digit"));
    }
}
