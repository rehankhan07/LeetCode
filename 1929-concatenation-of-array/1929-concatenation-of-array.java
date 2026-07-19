class Solution {
    public int[] getConcatenation(int[] arr) {
        int [] ans = new int [arr.length+arr.length];
         for (int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        for (int i=0;i<arr.length;i++){
            ans[i+arr.length]=arr[i];
        }
    return ans;
    }
}