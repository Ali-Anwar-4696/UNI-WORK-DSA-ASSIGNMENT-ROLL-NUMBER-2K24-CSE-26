// Name: Ali Anwar
// Roll Number: 2k24/CSE/26
// Class: BSCS - 2nd Year
// Subject: Data Structures and Algorithms (DSA)
// Assignment: Stack-based Problems
// Submission Date: 20th June 2025




public class RecursiveArraySum {
    public static int recursiveSum(int[] array, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return recursiveSum(array, n - 1) + array[n - 1];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20};
        int sum = recursiveSum(array, array.length);
        System.out.println("Sum of array elements: " + sum);
    }
}



//  Example Output:
// Sum of array elements: 50