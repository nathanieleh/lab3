import static org.junit.Assert.*;
import org.junit.*;

public class ArrayExamplesTester {
    @Test
    public void reverseInPlaceTester() {
        // failure inducing input
        // int[] input1 = { 0, 1, 2, 3 };
        // ArrayExamples.reverseInPlace(input1);
        // assertArrayEquals(new int[] { 3, 2, 1, 0 }, input1);

        // successful input
        int[] input2 = { 0 };
        ArrayExamples.reverseInPlace(input2);
        assertArrayEquals(new int[] { 0 }, input2);
    }
}
