public class SolutionTwo {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        int left = 0;
        int right = s.length() - 1; // sets the two pointers to the start and end of the string 

        while (left < right) { // while the two pointers are not in the same position
            char leftChar = s.charAt(left); // gets the character at the left pointer
            char rightChar = s.charAt(right); // gets the character at the right pointer

            if (leftChar != rightChar) { // if the characters are not the same
                // Check by skipping either the left or the right character
                return isValidPalindrome(s, left + 1, right) || isValidPalindrome(s, left, right - 1);
            }
            left++; // move the left pointer to the right
            right--; // move the right pointer to the left
        }

        return true;
    }

    private boolean isValidPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // the string is not a palindrome
            }
            left++; // move the left pointer to the right
            right--; // move the right pointer to the left
        }
        return true; // the string is a palindrome
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1) - because we are not using any extra space to create a new string or array. We are just using two pointers to traverse the string from both ends towards the center.

