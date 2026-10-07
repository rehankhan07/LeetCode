class Solution {
    public int minRotations(String s) {
        int [] arr = new int [10];
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
             int digit = ch - '0';
            arr[i]= digit;
        }
     
        int res =0;
        for(int i=0;i<arr.length;i++){
            int start=i-1;
            if(i==0){
                res+=Math.min( arr[i] , (10-arr[i]));
            }
            else{
                 int abs=Math.abs(arr[start]-arr[i]);
                 res += Math.min( abs , (10-abs));
            }
        }
        return res;
    }
}