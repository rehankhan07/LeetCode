class Solution {
    public boolean checkDivisibility(int n) {
        int p = n;
        int sum=0;
        int pro=1;
        while(n>0){
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        int res= sum+pro;
        if(p % res==0) return true;
        return false;
    }
}