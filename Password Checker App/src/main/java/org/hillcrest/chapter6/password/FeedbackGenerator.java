public class FeedbackGenerator {

    public String generateFeedback(boolean[] results) {
        StringBuilder feedback = new StringBuilder();

        if (results[0] && results[1] && results[2] && results[3] && results[4]) {
            feedback.append("✅ Strong password! Well done.");
        } else {
            feedback.append("❌ Weak password. Suggestions:\n");
            if (!results[0]) feedback.append("- Use at least 8 characters.\n");
            if (!results[1]) feedback.append("- Add at least one uppercase letter.\n");
            if (!results[2]) feedback.append("- Add at least one lowercase letter.\n");
            if (!results[3]) feedback.append("- Include at least one digit.\n");
            if (!results[4]) feedback.append("- Include at least one special character (!@#$%^&* etc.).\n");
        }

        return feedback.toString();
    }
}
