class Solution {
    public int removeDuplicates(int[] arr) {
      int j=0;
      for(int i=0;i<arr.length;i++){
        if(arr[j]!=arr[i]){
           arr [++j]=arr[i];
        }
      }
      return j+1;
    }
}