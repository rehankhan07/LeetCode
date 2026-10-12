class Solution {
    public int maxAbsoluteSum(int[] arr) {
       int cumax=0,max=0;
       int cumin=0,min=0;
       for(int ele: arr){
        cumax=Math.max(0,cumax+ele);
        max=Math.max(cumax,max);
        cumin=Math.min(0,cumin+ele);
        min=Math.min(cumin,min);
       }
       return Math.max(max,Math.abs(min));
    }
}