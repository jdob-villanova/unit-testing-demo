import csc4700.NumbersDemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ClassDemoTests {

    @Test
    public void testSumList() {
        NumbersDemo d = new NumbersDemo();
        int[] input = {2, 8, 14};
        int result = d.sumList(input);
        assertEquals(24, result);
    }

    @Test
    public void testSumListNegatives() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        int[] input = {-2, 8, 14};

        // Test
        int result = d.sumList(input);

        // Verification
        assertEquals(22, result);
    }

    @Test
    public void testSumListSingleNumber() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        int[] input = {2};

        // Test
        int result = d.sumList(input);

        // Verification
        assertEquals(2, result);
    }

    @Test
    public void testSumListEmptyList() {
        // Setup
        NumbersDemo d = new NumbersDemo();
        int[] input = {};

        // Test
        int result = d.sumList(input);

        // Verification
        assertEquals(0, result);
    }

    @Test
    public void testSumListNull() {
        // Setup
        NumbersDemo d = new NumbersDemo();

        // Test
        try {
            d.sumList(null);
            fail("Expected exception");
        }
        catch(IllegalArgumentException e) {
            // Expected
        }
    }

}
