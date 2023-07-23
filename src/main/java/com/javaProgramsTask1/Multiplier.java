package com.javaProgramsTask1;

public class Multiplier {

    /**
     * This will take array of numbers as a parameter and returns the number of
     *  values that are a multiplier of either 4 or 6
     *
     * @return int
     */
    public static int countMultiples(int[] numbers) {
        int count = 0;

        for (int num : numbers) {
            if (num % 4 == 0 || num % 6 == 0) {
                count++;
            }
        }

        return count;
    }

}
