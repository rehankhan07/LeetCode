class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      for(int[] a: matrix){
        for(int ele: a){
            if(ele== target) return true;
        }
      }
      return false;
    }
}