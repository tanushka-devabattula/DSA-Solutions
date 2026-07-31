class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
       int left = 0;
int right = n - 1;

for (int i = 1; i <= n / 2; i++) {
    res[left++] = i;
    res[right--] = -i;
}

       

        return res;
    }
}