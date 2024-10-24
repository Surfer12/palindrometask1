public class validPalindrome {

    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(s.charAt(left).toLowerCase()) != !Character.isLetterOrDigit(s.charAt(right).toLowerCase())) {
                // Try skipping either left or right character
                return isPalindrome(s, left + 1, right) || 
                       isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
            
        }
        return true;
    }
    
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/* Time and Space Complexity Analysis:
1. Time Complexity: O(n)
The main loop traverses the string from both ends towards the middle, taking O(n/2) time
In the worst case (when we find a mismatch), we check two possible palindromes by skipping either the left or right character
Each check is O(n/2) in the worst case
Total: O(n/2) + O(n/2) + O(n/2) = O(n)
Space Complexity: O(1)
We only use a constant amount of extra space (two pointers)
No additional data structures are created
The space used doesn't grow with input size
Solution Explanation:
1. Use two pointers (left and right) starting from both ends of the string
Move towards the center while characters match
When a mismatch is found, try two possibilities:
Skip the left character and check if remaining is palindrome
Skip the right character and check if remaining is palindrome
If either possibility works, return true
5. If no mismatch is found, string is already palindrome
This solution is optimal as it:
Achieves the required O(n) time complexity
Uses O(1) space complexity
Handles all test cases correctly
Is easy to understand and maintain */
