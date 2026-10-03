class Solution {
    public int[] findErrorNums(int[] arr) {
      HashSet<Integer> set = new HashSet<>();
        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                res[0] = arr[i];
            }
            set.add(arr[i]);
        }
        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                res[1] = i;
                break;
            }
        }
        return res;
    }
}