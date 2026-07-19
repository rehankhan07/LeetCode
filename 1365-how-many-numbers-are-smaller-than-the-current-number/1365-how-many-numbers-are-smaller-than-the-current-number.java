class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int check=0;
        int count =0;
        int [] res = new int [arr.length];
        for(int i=0;i<arr.length;i++){
         check=arr[i];
         for(int j=0;j<arr.length;j++){
            if(arr[j]<check){
                count++;
            }
         }
         res[i]=count;
         count=0;
        }
        return res;
    }
}