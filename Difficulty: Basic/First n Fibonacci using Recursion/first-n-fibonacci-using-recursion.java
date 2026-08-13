class Solution {
    // Function to return a list containing the first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Handle edge case where n is 0 or negative
        if (n <= 0) {
            return new int[0];
        }
        
        int[] res = new int[n];
        
        // Base case: The first Fibonacci number is always 0
        res[0] = 0;
        
        // If n is 1, return the array immediately
        if (n == 1) {
            return res;
        }
        
        // Base case: The second Fibonacci number is always 1
        res[1] = 1;
        
        // Iteratively calculate the remaining numbers
        for (int i = 2; i < n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        
        return res;
    }
}
