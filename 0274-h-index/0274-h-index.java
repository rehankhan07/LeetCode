class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            int ccs= arr.length-i;
            if(arr[i]>=ccs){
                return ccs; 
            }
        }
        return 0;
    }
}