class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
      int l =n ;
      for(int i=0;i<arr.length;i++){
      if(arr[i] == 0 &&(i == 0 || arr[i - 1] == 0) && (i == arr.length - 1 || arr[i + 1] == 0)){
        arr[i]=1;
        l--;
       }
      }  
       return l <= 0;
    }
}