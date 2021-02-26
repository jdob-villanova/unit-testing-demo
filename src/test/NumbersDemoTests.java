import static org.junit.jupiter.api.Assertions.*;

import csc4700.NumbersDemo;

import org.junit.jupiter.api.Test;

public class NumbersDemoTests {

    @Test
    public void testSum() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        int[] data = {4, 8, 6};

        // Test
        int result = d.sum(data);

        // Verify
        assertEquals(18, result);
    }

    @Test
    public void testSumEmptyArray() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        int[] data = new int[0];

        // Test
        int result = d.sum(data);

        // Verify
        assertEquals(0, result);
    }

    @Test
    public void testSumNull() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        int[] data = null;

        // Test
        try {
            int result = d.sum(data);
            fail("Expected an exception");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testParseAndSum() {
        // Setup
        String data = "1,2,3,4";
        NumbersDemo d = new NumbersDemo();

        // Test
        int result = d.parseAndSum(data);

        // Verify
        assertEquals(10, result);
    }

    @Test
    public void testParseAndSumNull() {
        // Setup
        NumbersDemo d = new NumbersDemo();

        // Test
        try {
            int result = d.parseAndSum(null);
            fail("Expected an exception");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAverage() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        int[] data = {1, 1, 3};

        // Test
        float result = d.average(data);

        // Verify
        assertEquals(5 / 3f, result, 0.001);
    }
}
