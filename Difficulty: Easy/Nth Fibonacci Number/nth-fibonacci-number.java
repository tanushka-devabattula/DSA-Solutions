class Solution {
     static int fib(int num)
    {
         if(num<=1)
     return num;
     
        return fib(num - 1)  + fib(num - 2);
             
    
    }
    
    static int nthFibonacci(int n) {
        int res=0;
        for(int i=1;i<=n;i++)
        res=fib(i);
        return res;
     

          
        
        
    }
}