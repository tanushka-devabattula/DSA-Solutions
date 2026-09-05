class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0,temp=n;
        while(n!=0)
        {
            int rem=n%10;
            sum+=Math.pow(rem,3);
            n/=10;
        }
        return temp==sum;
    }
}