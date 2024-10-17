public class solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        int left = 0;
        int right = s.length() - 1; // sets the two pointers to the start and end of the string \
        int countValidChars = 0; // Counter for valid alphanumeric characters

        while (left < right) { // while the two pointers are not in the same position
            char leftChar = s.charAt(left); // gets the character at the left pointer
            char rightChar = s.charAt(right); // gets the character at the right pointer

            if (!Character.isLetterOrDigit(leftChar)) { // if the character at the left pointer is not a letter or digit
                left++; // move the left pointer to the right
            } else if (!Character.isLetterOrDigit(rightChar)) { // if the character at the right pointer is not a letter or digit
                right--; // move the right pointer to the left
            } else { // if the characters at the two pointers are letters or digits
                countValidChars++; // Increment valid character count
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) { // if the characters are not the same
                    return false; // the string is not a palindrome
                }
                left++; // move the left pointer to the right
                right--; // move the right pointer to the left
            }
        }

        return countValidChars == 0 || left >= right; // Return true if no valid characters were found
    }
}

// This uses the two pointer technique to check if the string is a palindrome.
// It ignores non-alphanumeric characters and checks if the characters are the same with isLetterOrDigit and toLowerCase. 
// It returns true if the string is a palindrome, false otherwise.

// Time Complexity: O(n)
// Space Complexity: O(1) - because we are not using any extra space to create a new string or array. We are just using two pointers to traverse the string from both ends towards the center.



