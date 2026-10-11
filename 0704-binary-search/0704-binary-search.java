class Solution {
    public int search(int[] arr, int k) {
      int l=0;
      int r=arr.length-1;
      int ans =-1;
      while(l<= r){
       int mid = l+(r-l)/2;
       if(arr[mid]==k) return  mid;
       if(arr[mid] < k) l=mid+1;
       else r=mid-1;
       
      }
      return ans;
    }
}