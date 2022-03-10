import static org.junit.jupiter.api.Assertions.*;

import csc4700.PhoneNumberDemo;

import org.junit.jupiter.api.Test;

public class PhoneNumberDemoTests {

    @Test
    public void testPhoneNumbers() {
        PhoneNumberDemo d = new PhoneNumberDemo();

        assertTrue(d.isNumberValid("123-456-7890"));
        assertTrue(d.isNumberValid("(123)456-7890"));
        assertTrue(d.isNumberValid("(123) 456-7890"));
        assertTrue(d.isNumberValid("1234567890"));

        assertFalse(d.isNumberValid("12345678"));
        assertFalse(d.isNumberValid("jason"));
    }

    @Test
    public void testPhoneNumbersNull() {
        PhoneNumberDemo d = new PhoneNumberDemo();

        try {
            d.isNumberValid(null);
            fail("Expected an error");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}
