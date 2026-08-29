class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int ex) {
        ArrayList<Boolean> res = new ArrayList<>();
        int n=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>n) n=arr[i];
        }
        for(int i =0;i<arr.length;i++){
            if((arr[i]+ex)>=n){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
    return res;
    }
}