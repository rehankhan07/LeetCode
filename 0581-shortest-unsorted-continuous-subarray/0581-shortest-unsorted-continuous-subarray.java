class Solution {
    public int findUnsortedSubarray(int[]arr) {
        if(arr.length==1) return 0;
        int[] num = new int[arr.length];
        int count =0;
        for(int i =0;i<arr.length;i++){
            num[i]=arr[i];
        }
        Arrays.sort(num);
        int left=0;
        int right=arr.length-1;
        int l=0;
        int r=0;
         while(left<arr.length){
            if(arr[left]!=num[left]) {
                l=left;
                break;
            }
           else left++;
         }
         if(left==arr.length) return 0;
          while(right>=0){
            if(arr[right]!=num[right]){
                 r=right;
                 break;
            }
          else  right--;
         }
        return r-l+1;
    }
}