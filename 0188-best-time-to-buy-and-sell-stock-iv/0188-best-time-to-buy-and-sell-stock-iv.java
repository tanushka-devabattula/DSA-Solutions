class Solution {
    public int recur(int i, int holding, int k, int[] arr, Integer[][][] memo) {
        if (i == arr.length || k == 0) {
            return 0;
        }

        if (memo[i][holding][k] != null) {
            return memo[i][holding][k];
        }

        int profit;
        if (holding == 0) {
            profit = Math.max(
                recur(i + 1, 0, k, arr, memo),
                recur(i + 1, 1, k, arr, memo) - arr[i]
            );
        } else {
            profit = Math.max(
                recur(i + 1, 1, k, arr, memo),
                recur(i + 1, 0, k - 1, arr, memo) + arr[i]
            );
        }

        return memo[i][holding][k] = profit;
    }

    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0 || k == 0) {
            return 0;
        }
        
        Integer[][][] memo = new Integer[prices.length][2][k + 1];
        
        return recur(0, 0, k, prices, memo);
    }
}