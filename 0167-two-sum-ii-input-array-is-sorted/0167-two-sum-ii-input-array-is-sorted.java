class Solution {
    public int[] twoSum(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        int [] res = new int [2];
        while(left<=right){
          if(arr[left]+arr[right]> target) {
          right--;
          }
         else if(arr[left]+arr[right]< target){
           left++;
          } 
         else if(arr[left]+arr[right]==target){
            res[0]=left+1;
            res[1]=right+1;
             break;   
          }
        }
       return res;
    }
}