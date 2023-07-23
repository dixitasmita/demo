package automation;

import org.junit.Test;

import static com.javaProgramsTask1.Palindrome.isPalindrome;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        String palindromeStr = "racecar";
        assertTrue(isPalindrome(palindromeStr));
    }

    @Test
    public void testIsNotPalindrome() {
        String nonPalindromeStr = "hello";
        assertFalse(isPalindrome(nonPalindromeStr));
    }

    @Test
    public void testEmptyString() {
        String emptyStr = "";
        assertTrue(isPalindrome(emptyStr));
    }

    @Test
    public void testSingleCharacter() {
        String singleCharStr = "a";
        assertTrue(isPalindrome(singleCharStr));
    }


    @Test
    public void testNonPalindromeWithSpaces() {
        String nonPalindromeWithSpaces = "hello world";
        assertFalse(isPalindrome(nonPalindromeWithSpaces));
    }

    @Test
    public void testNonPalindromeWithSpecialCharacters() {
        String nonPalindromeSpecialChars = "a@b#c$d!a";
        assertFalse(isPalindrome(nonPalindromeSpecialChars));
    }

}
