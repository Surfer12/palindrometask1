package palindrome;

/**
 * This class provides a method to check if a given string is a palindrome.
 * A palindrome is a string that reads the same forward and backward, 
 * ignoring non-alphanumeric characters and case.
 */
public class Solution {
    
    /**
     * Checks if the input string is a palindrome.
     *
     * @param s the input string to check
     * @return true if the string is a palindrome, false otherwise
     * @throws IllegalArgumentException if the input string is null or empty
     */
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        int left = 0; // Pointer starting from the beginning of the string
        int right = s.length() - 1; // Pointer starting from the end of the string

        while (left < right) { // Continue until the two pointers meet
            char leftChar = s.charAt(left); // Character at the left pointer
            char rightChar = s.charAt(right); // Character at the right pointer

            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(leftChar)) { // Uses to check if the character is a letter or a digit, if it is not, like a space, it will skip it. Case 4. 
                left++; // Move the left pointer to the right
            } 
            // Skip non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(rightChar)) { 
                right--; // Move the right pointer to the left
            } 
            // Compare the characters at both pointers
            else { 
                // If characters are not the same (case insensitive)
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) { 
                    return false; // The string is not a palindrome
                }
                left++; // Move the left pointer to the right
                right--; // Move the right pointer to the left
            }
        }

        return true; // The string is a palindrome
    }
}

// This implementation uses the two-pointer technique to check if the string is a palindrome.
// It ignores non-alphanumeric characters and performs a case-insensitive comparison.
// Time Complexity: O(n)
// Space Complexity: O(1) - No extra space is used apart from the pointers.
