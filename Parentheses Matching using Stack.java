// Name: Ali Anwar
// Roll Number: 2k24/CSE/26
// Class: BSCS - 2nd Year
// Subject: Data Structures and Algorithms (DSA)
// Assignment: Stack-based Problems
// Submission Date: 20th June 2025





import java.util.Stack;

public class ParenthesesMatcher {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "{ ( [ ] ) }";
        boolean result = isBalanced(expression.replaceAll("\\s+", ""));

        if (result) {
            System.out.println("Parentheses are balanced.");
        } else {
            System.out.println("Parentheses are NOT balanced.");
        }
    }
}


// Example Output:
// Parentheses are balanced.