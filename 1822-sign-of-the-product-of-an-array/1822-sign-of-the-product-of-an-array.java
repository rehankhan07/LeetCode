class Solution {
    public int arraySign(int[] nums) {
      int od = 0;
        for (int ele : nums) {
            if (ele == 0) return 0;
            if (ele < 0) od++;
        }
        return od % 2 == 0 ? 1 : -1;
    }
}