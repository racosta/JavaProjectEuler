package Utility;

/**
 * Created by SG0210832 on 4/15/2016.
 */
public class Palindrome {
    /**
     * Checks if the {@link String} word is a palindrome.
     * @param word {@link String} to check.
     * @return {@code boolean} {@code True} if word is a palindrome, else {@code False}.
     */
    public static boolean isPalindrome(String word) {
        int left  = 0;                 // index of leftmost unchecked char
        int right = word.length() -1;  // index of the rightmost

        while (left < right) {         // continue until they reach center
            if (word.charAt(left) != word.charAt(right)) {
                return false;          // if chars are different, finished
            }
            left++;                    // move left index toward the center
            right--;                   // move right index toward the center
        }

        return true;                   // if finished, all chars were same
    }

    /**
     * Checks if the integer n is a palindrome.
     * @param n int to check
     * @return boolean True if n is a palindrome, else False.
     */
    public static boolean isPalindrome(int n) {
        return isPalindrome(Integer.toString(n));
    }

    /**
     * Checks if the long n is a palindrome.
     * @param n long to check
     * @return boolean True if n is a palindrome, else False.
     */
    public static boolean isPalindrome(long n) {
        return isPalindrome(Long.toString(n));
    }
}
