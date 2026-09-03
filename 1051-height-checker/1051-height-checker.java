class Solution {
    public int heightChecker(int[] arr) {
       int n = arr.length;
       int[] res = new int [n];
       for(int i =0;i<n;i++){
        res[i]=arr[i];
       }
       Arrays.sort(res);
       int ans =0;
       for(int i =0;i< n;i++){
        if(arr[i]!= res [i]) ans++;
       }
       return ans;
    }
}