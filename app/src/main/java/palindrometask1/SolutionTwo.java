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

public class SolutionTwo
{
    public boolean validPalindrome(String s)
    {
        int left = 0, right = s.length() - 1;
        while (left < right)
        {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (leftChar != rightChar)
            {
                return isValidPalindrome(s, left + 1, right) || isValidPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isValidPalindrome(String s, int left, int right)
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

// The above code is an implementation of the solution to the problem "680. Valid Palindrome II" on LeetCode.
// Approach:
// 1. We will use two pointers, left and right, to traverse the string from both ends towards the center.
// 2. If the characters at the left and right pointers are equal, we will increment the left pointer and decrement the right pointer.
// 3. If the characters at the left and right pointers are not equal, we will check if the string is a palindrome after deleting the character at the left pointer or the character at the right pointer.
// 4. To check if the string is a palindrome after deleting a character, we will create a helper function isValidPalindrome that takes the string and the indices of the left and right pointers.
// 5. In the isValidPalindrome function, we will check if the characters at the left and right pointers are equal. If they are not

// Time Complexity: O(n)
// Space Complexity: O(1) - because we are not using any extra space to create a new string or array. We are just using two pointers to traverse the string from both ends towards the center.

