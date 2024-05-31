import static org.junit.jupiter.api.Assertions.assertEquals;
import org.testng.annotations.Test;

public class ArrayTests {

    @Test
    public void testArrayInitialization() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
        assertEquals(0, array[0]);
        assertEquals(1, array[1]);
        assertEquals(4, array[2]);
        assertEquals(9, array[3]);
        assertEquals(16, array[4]);
        assertEquals(25, array[5]);
        assertEquals(36, array[6]);
        assertEquals(49, array[7]);
        assertEquals(64, array[8]);
        assertEquals(81, array[9]);
    }
}
