class Solution {
    public int fib(int num) {

            if (num == 0) return 0;
        if (num == 1) return 1;
        if (num == 2) return 1;

             return (fib(num - 2) * 2) + fib(num - 3);
             
    
        
    }
}