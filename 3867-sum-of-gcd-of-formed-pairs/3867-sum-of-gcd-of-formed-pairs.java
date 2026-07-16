import java.util.*;

class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int mx = -1;

        List<Integer> prefixGcd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            prefixGcd.add(gcd(nums[i], mx));
        }

        Collections.sort(prefixGcd);

        long res = 0;

        for (int i = 0; i < n / 2; i++) {
            res += gcd(prefixGcd.get(i), prefixGcd.get(n - i - 1));
        }

        return res;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}