class Solution {
    public int kthSmallest(int[][] matrix, int k) {
      ArrayList<Integer> arr = new ArrayList<>();
      for(int [] a: matrix){
        for(int ele:a){
            arr.add(ele);
        }
      }
      Collections.sort(arr);
      return arr.get(k-1);
    }
}