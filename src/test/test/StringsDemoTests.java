import static org.junit.jupiter.api.Assertions.*;

import csc4700.StringsDemo;

import org.junit.jupiter.api.Test;


public class StringsDemoTests {

    @Test
    public void testReverse() {
        // Setup
        StringsDemo d = new StringsDemo();
        String data = "Software Engineering";

        // Test
        String result = d.reverse(data);

        // Verify
        assertEquals(result, "gnireenignE erawtfoS");
    }

    @Test
    public void testIsPalindromeValid() {
        // Setup
        StringsDemo d = new StringsDemo();
        String data = "radar";

        // Test
        boolean result = d.isPalindrome(data);

        // Verify
        assertTrue(result);
    }

    @Test
    public void testIsPalindromeInvalid() {
        // Setup
        StringsDemo d = new StringsDemo();
        String data = "not palindrome";

        // Test
        boolean result = d.isPalindrome(data);

        // Verify
        assertFalse(result);
    }

}
