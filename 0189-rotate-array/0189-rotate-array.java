class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k= k%n;
      rotatearr(nums,0,nums.length-1);
        rotatearr(nums,0,k-1);
        rotatearr(nums,k,nums.length-1);
    }
     public static void rotatearr(int[] arr,int initial , int last){
        while ( initial < last){
            int temp = arr[initial];
            arr[initial]=arr[last];
            arr[last]= temp;
            initial++;
            last--;

        }
    }

}