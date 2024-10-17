/* 680. Valid Palindrome II
Easy

Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Example 3:
Input: s = "abc"
Output: false

Constraints:
- 1 <= s.length <= 10^5
- s consists of lowercase English letters. */

public class solutionTwo
{
    public boolean validPalindrome(String s)
    {
        int left = 0, right = s.length() - 1;
        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return validPalindromeAlteration(s, left + 1, right) || validPalindromeAlteration(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean validPalindromeAlteration(String s, int left, int right)
    {
        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1) - because we are not using any extra space to create a new string or array. We are just using two pointers to traverse the string from both ends towards the center.

