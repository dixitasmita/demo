package automation;

import org.junit.Test;

import static com.javaProgramsTask1.Multiplier.countMultiples;
import static org.junit.Assert.assertEquals;

public class MultiplierTests {

    @Test
    public void testCountMultiplesWithNumbers() {
        int[] numbers = {12, 24, 8, 15, 18, 7, 9};
        int expectedCount = 4; // Numbers divisible by 4 or 6: 12, 24, 8, 18
        int actualCount = countMultiples(numbers);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountMultiplesWithEmptyArray() {
        int[] numbers = {};
        int expectedCount = 0; // Empty array, so there are no multiples of 4 or 6
        int actualCount = countMultiples(numbers);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountMultiplesWithNoMultiples() {
        int[] numbers = {7, 11, 13, 17, 23};
        int expectedCount = 0; // No numbers are divisible by 4 or 6
        int actualCount = countMultiples(numbers);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountMultiplesWithOnlyMultiples() {
        int[] numbers = {4, 12, 6, 18};
        int expectedCount = 4; // All numbers are divisible by 4 or 6
        int actualCount = countMultiples(numbers);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountMultiplesWithSingleNumber() {
        int[] numbers = {9};
        int expectedCount = 0; // The single number is not divisible by 4 or 6
        int actualCount = countMultiples(numbers);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountMultiplesWithNegativeMultiples() {
        int[] numbers = {-8, -12, -6, -18};
        int expectedCount = 4; // All negative numbers are divisible by 4 or 6
        int actualCount = countMultiples(numbers);
        assertEquals(expectedCount, actualCount);
    }



}
