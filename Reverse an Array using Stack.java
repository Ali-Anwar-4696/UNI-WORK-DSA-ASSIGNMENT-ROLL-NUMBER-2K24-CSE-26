// Name: Ali Anwar
// Roll Number: 2k24/CSE/26
// Class: BSCS - 2nd Year
// Subject: Data Structures and Algorithms (DSA)
// Assignment: Stack-based Problems
// Submission Date: 20th June 2025



import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();

        // Push all elements to stack
        for (int value : array) {
            stack.push(value);
        }

        // Pop all elements back to array
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

 // Example Output:
 // Reversed Array: 5 4 3 2 1 
