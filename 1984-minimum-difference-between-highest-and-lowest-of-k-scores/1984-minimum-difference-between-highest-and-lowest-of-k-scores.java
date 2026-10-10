class Solution {
    public int minimumDifference(int[] arr, int k) {
        if(k==1) return 0;
        int max=Integer.MIN_VALUE;
        int low=Integer.MAX_VALUE;
        int min =Integer.MAX_VALUE;
        Arrays.sort(arr);
      for(int i =0;i<k;i++){
       if(arr[i] < min) min=arr[i];
       if(arr[i] >max) max=arr[i];
      }  
      low=max-min;
      for(int i =k;i< arr.length;i++){
         max= arr[i];
         min= arr[i-k+1];
        int sum = (max-min);
        low=Math.min(sum,low);
      }
      return low;
    }
}