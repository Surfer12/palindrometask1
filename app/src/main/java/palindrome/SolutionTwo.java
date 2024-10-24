package palindrome;

/**
 * This class provides a method to check if a given string is a palindrome,
 * allowing for the removal of at most one character.
 */
public class SolutionTwo {

    /**
     * Checks if the input string is a palindrome.
     *
     * @param s the input string to check
     * @return true if the string is a palindrome or can be made one by removing one character, false otherwise
     * @throws IllegalArgumentException if the input string is null or empty
     */
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        int left = 0; // pointer starting from the beginning of the string
        int right = s.length() - 1; // pointer starting from the end of the string 

        while (left < right) { // iterate until the two pointers meet
            char leftChar = s.charAt(left); // character at the left pointer
            char rightChar = s.charAt(right); // character at the right pointer

            if (leftChar != rightChar) { // characters at pointers do not match
                // Check if skipping either the left or the right character results in a palindrome
                return isValidPalindrome(s, left + 1, right) || isValidPalindrome(s, left, right - 1);
            }
            left++; // move the left pointer to the right
            right--; // move the right pointer to the left
        }

        return true; // the string is a palindrome
    }

    /**
     * Helper method to check if a substring is a palindrome.
     *
     * @param s the input string
     * @param left the starting index of the substring
     * @param right the ending index of the substring
     * @return true if the substring is a palindrome, false otherwise
     */
    private boolean isValidPalindrome(String s, int left, int right) {
        while (left < right) { // iterate until the two pointers meet
            if (s.charAt(left) != s.charAt(right)) {
                return false; // characters do not match, not a palindrome
            }
            left++; // move the left pointer to the right
            right--; // move the right pointer to the left
        }
        return true; // the substring is a palindrome
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1) - no extra space is used, only two pointers are utilized.
