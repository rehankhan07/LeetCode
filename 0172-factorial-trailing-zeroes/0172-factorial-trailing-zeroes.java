class Solution {
    public int trailingZeroes(int n) {
        // if(n==0) return 0;
        // long res=fact( n);
        // int di=0;
        // String text = String.valueOf(res);
        // for(int i=0;i<text.length();i++){
        //     int f= res.charAt(i);
        //     if(f=='0') di++;
        // }
        // return di;
        int count = 0;
         while (n > 0) {
        n = n / 5;
        count += n;
        }
        return count;
    }
    // public long fact(int n){
    //     if(n==0||n==1) return 1;
    //     return n*fact(n-1);
    // }
}