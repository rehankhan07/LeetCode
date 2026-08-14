class Solution {
    public int[] getFinalState(int[] arr, int k, int multiplier) {
        while(k>0){
            int min = Integer.MAX_VALUE;
            int index=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]< min){
                min = arr[i];
                 index=i;
                }
                
            }
            arr[index]=arr[index]*multiplier;
            k--;
        }
        return arr;
        
    }
}