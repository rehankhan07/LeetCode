class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int low =0, high =n-1;
        int num =1;
        while(low<high){
            ans[low]=num;
            ans[high]=-num;
            low++;
            high--;
            num++;
        }
        return ans;
    }
}