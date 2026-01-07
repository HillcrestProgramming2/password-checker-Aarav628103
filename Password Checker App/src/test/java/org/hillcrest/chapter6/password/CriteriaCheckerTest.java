package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CriteriaCheckerTest {

    private final CriteriaChecker checker = new CriteriaChecker();

    @Test
    void testValidPassword() {
        boolean[] results = checker.checkPassword("Abcdef1!");

        assertTrue(results[0]); // length
        assertTrue(results[1]); // uppercase
        assertTrue(results[2]); // lowercase
        assertTrue(results[3]); // digit
        assertTrue(results[4]); // special char
    }

    @Test
    void testMissingUppercase() {
        boolean[] results = checker.checkPassword("abcdef1!");

        assertFalse(results[1]);
    }

    @Test
    void testMissingLowercase() {
        boolean[] results = checker.checkPassword("ABCDEF1!");

        assertFalse(results[2]);
    }

    @Test
    void testMissingDigit() {
        boolean[] results = checker.checkPassword("Abcdefg!");

        assertFalse(results[3]);
    }

    @Test
    void testMissingSpecialCharacter() {
        boolean[] results = checker.checkPassword("Abcdefg1");

        assertFalse(results[4]);
    }

    @Test
    void testTooShort() {
        boolean[] results = checker.checkPassword("Ab1!");

        assertFalse(results[0]);
    }
}
