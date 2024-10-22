
public class App {
    public static void main(String[] args) throws Exception {
        // Testing SolutionTwo
        SolutionTwo solutionTwo = new SolutionTwo();
        System.out.println("Testing SolutionTwo:");
        System.out.println("Input: 'aba' -> Output: " + solutionTwo.validPalindrome("aba")); // true
        System.out.println("Input: 'abca' -> Output: " + solutionTwo.validPalindrome("abca")); // true
        System.out.println("Input: 'abc' -> Output: " + solutionTwo.validPalindrome("abc")); // false

        // Testing Solution
        Solution solution = new Solution();
        System.out.println("\nTesting Solution:");
        System.out.println("Input: 'A man, a plan, a canal: Panama' -> Output: " + solution.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println("Input: 'race a car' -> Output: " + solution.isPalindrome("race a car")); // false
        System.out.println("Input: ' ' -> Output: " + solution.isPalindrome(" ")); // true
    }
}
