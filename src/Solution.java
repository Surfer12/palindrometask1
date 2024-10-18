/* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters. */

public class Solution
{
    public boolean isPalindrome(String s)
    {
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("Input string is null or empty");
        }
        int left = 0, 
        right = s.length() - 1; // Two pointer approach to compare characters from both ends towards the center

        while (left < right)
        {
            char leftChar = s.charAt(left); // Get the character at the left pointer
            char rightChar = s.charAt(right); // Get the character at the right pointer
            if (!Character.isLetterOrDigit(leftChar)) // If the character at the left pointer is not a letter or digit, increment the left pointer
            {
                left++;
            }
            else if (!Character.isLetterOrDigit(rightChar)) // If the character at the right pointer is not a letter or digit, decrement the right pointer. This is to skip non-alphanumeric characters like spaces, punctuation, etc. Specfic for case 3. 
            {
                right--;
            }
            else if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))
            {
                return false;
            }
            else
            {
                left++;
                right--;
            }
        }
        return true;
    }
}

// The above code is an implementation of the solution to the problem "125. Valid Palindrome" on LeetCode.
// The code uses a two pointer approach to compare characters from both ends towards the center.
// It skips non-alphanumeric characters and converts all letters to lowercase before comparison.
// If any characters do not match, it returns false. If all characters match, it returns true. 
// The code also includes error handling for null or empty input strings.
// Time Complexity: O(n) where n is the length of the string input. 
// Space Complexity: O(1) we are not using any extra space by creating arrays. 

