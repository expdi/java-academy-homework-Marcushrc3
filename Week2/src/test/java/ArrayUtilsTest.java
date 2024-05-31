import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.marcus.ArrayUtils;
public class ArrayUtilsTest {

    @Test
    public void testCreateArray() {
        int size = 10;
        int limit = 50;
        int[] array = ArrayUtils.createArray(size, limit);
        assertEquals(size, array.length);
        for (int value : array) {
            assertTrue(value >= 0 && value < limit);
        }
    }
}