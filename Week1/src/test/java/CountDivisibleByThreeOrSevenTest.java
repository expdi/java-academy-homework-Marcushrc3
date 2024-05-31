import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDivisibleByThreeOrSevenTest {
    @Test
    public void testCountDivisibleByThreeOrSeven() {
        int expectedCount = 429; // Expected count of numbers divisible by 3 or 7 between -500 and 500
        int actualCount = countNumbersDivisibleByThreeOrSeven();
        System.out.println("Expected: " + expectedCount);
        System.out.println("Actual: " + actualCount);
        assertEquals(expectedCount, actualCount);
    }

    private int countNumbersDivisibleByThreeOrSeven() {
        int count = 0;
        for (int i = -500; i <= 500; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                count++;
            }
        }
        return count;
    }
}
