package com.javaProgramsTask1;

public class Palindrome {

    /**
     * This will check if the string is palindrome
     *
     * @param str
     * @return boolean
     */
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String testString1 = "racecar";
        String testString2 = "hello";

        System.out.println(testString1 + " is a palindrome? " + isPalindrome(testString1));
        System.out.println(testString2 + " is a palindrome? " + isPalindrome(testString2));
    }
}

