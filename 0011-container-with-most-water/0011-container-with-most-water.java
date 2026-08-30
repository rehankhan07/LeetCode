class Solution {
    public int maxArea(int[] arr) {
     int left=0 , right=arr.length-1, maxarea=0;
      while(left<right){
        int area = Math.min(arr[left],arr[right])*(right-left);
        maxarea= Math.max(maxarea,area);
        if(arr[left]<arr[right]) left++;
        else{
            right--;
        }
      }
      return maxarea;
    }
}