// ValidPalindromeIIPrompt.md

// Given a string s, return true if the s can be palindrome after deleting at most one character from it.

// Example 1:
// Input: s = "aba"
// Output: true

// Example 2:
// Input: s = "abca"



public class solutionTwo {
    public boolean validPalindrome(String s) {
         if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        int left = 0;
        int right = s.length() - 1; // sets the two pointers to the start and end of the string 

        while (left < right) { // while the two pointers are not in the same position
            char leftChar = s.charAt(left); // gets the character at the left pointer
            char rightChar = s.charAt(right); // gets the character at the right pointer

            if (!Character.isLetterOrDigit(leftChar)) { // if the character at the left pointer is not a letter or digit
                left++; // move the left pointer to the right
            } else if (!Character.isLetterOrDigit(rightChar)) { // if the character at the right pointer is not a letter or digit
                right--; // move the right pointer to the left
            } else { // if the characters at the two pointers are letters or digits
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) { // if the characters are not the same
                    return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1); // check if the string is a palindrome after deleting the character at the left pointer or the character at the right pointer
                }
                left++; // move the left pointer to the right
                right--; // move the right pointer to the left
            }
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (leftChar != rightChar) {
                return false;
    
}

}
        return true;
    }
}
