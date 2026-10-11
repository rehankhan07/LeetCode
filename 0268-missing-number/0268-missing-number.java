class Solution {
    public int missingNumber(int[] arr) {
     int n = arr.length;
     int sum=0;
     for(int i =0;i<arr.length;i++){
        sum+=arr[i];
     }
     int ans = n*(n+1)/2;
     return ans-sum;
    } 
}