class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int x = nums2[0] - nums1[i];
            int p = i;
            int q = 0;
            int count = 0;
            while (p < nums1.length && q < nums2.length) {
                if (nums1[p] + x == nums2[q]) {
                    p++;
                    q++;
                    count++;
                } else {
                    p++;
                }
            }
            if (count == nums2.length) {
                ans = Math.min(ans, x);
            }
        }
        return ans;
    }
}

    
