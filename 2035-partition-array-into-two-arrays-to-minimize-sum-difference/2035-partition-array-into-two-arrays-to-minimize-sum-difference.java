 import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {

    void recur(int i, int sum, int cnt, List<Integer>[] A, int[] arr) {
        if (i < 0) {
            A[cnt].add(sum);
            return;
        }

        recur(i - 1, sum, cnt, A, arr);
        recur(i - 1, sum + arr[i], cnt + 1, A, arr);
    }

    int binary_search(List<Integer> arr, int val) {
        int l = 0;
        int r = arr.size() - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr.get(mid) == val)
                return val;

            if (arr.get(mid) > val)
                r = mid - 1;
            else
                l = mid + 1;
        }

        if (l == arr.size())
            return arr.get(r);

        if (r < 0)
            return arr.get(l);

        if (Math.abs(arr.get(l) - val) < Math.abs(arr.get(r) - val))
            return arr.get(l);

        return arr.get(r);
    }

    public int minimumDifference(int[] nums) {

        int n = nums.length;
        int half = n / 2;

        int[] left = new int[half];
        int[] right = new int[half];

        for (int i = 0; i < half; i++) {
            left[i] = nums[i];
            right[i] = nums[i + half];
        }

        List<Integer>[] A = new ArrayList[half + 1];
        List<Integer>[] B = new ArrayList[half + 1];

        for (int i = 0; i <= half; i++) {
            A[i] = new ArrayList<>();
            B[i] = new ArrayList<>();
        }

        recur(half - 1, 0, 0, A, left);
        recur(half - 1, 0, 0, B, right);

        for (int i = 0; i <= half; i++)
            Collections.sort(B[i]);

        int total = 0;

        for (int x : nums)
            total += x;

        int ans = Integer.MAX_VALUE;

        for (int cnt = 0; cnt <= half; cnt++) {

            int need = half - cnt;

            for (int x : A[cnt]) {

                int target = total / 2 - x;

                int y = binary_search(B[need], target);

                int sum1 = x + y;
                int sum2 = total - sum1;

                ans = Math.min(ans, Math.abs(sum1 - sum2));
            }
        }

        return ans;
    }
}