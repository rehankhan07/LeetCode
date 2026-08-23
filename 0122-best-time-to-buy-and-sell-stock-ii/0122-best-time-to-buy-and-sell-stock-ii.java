class Solution {
    public int maxProfit(int[] arr) {
     int slow=0;
     int fast=1;
     int maxpro=0;
     while(fast<arr.length){
       if(arr[slow]<arr[fast]){
        int day = arr[fast]-arr[slow];
        maxpro+=day;
        day=0;
        fast++;
        slow++;
       }
       else{
        fast++;
        slow++;
       }
     }
     return maxpro;
    }
}