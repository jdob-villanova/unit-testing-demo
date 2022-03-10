import static org.junit.jupiter.api.Assertions.*;

import csc4700.SortDemo;

import org.junit.jupiter.api.Test;

public class SortDemoTests {

    @Test
    public void testInPlaceSort() {
        // Setup
        SortDemo d = new SortDemo();
        int[] data = {4, 2, 6};

        // Test
        int[] result = d.sort(data);

        // Verify
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, data);
    }

}
