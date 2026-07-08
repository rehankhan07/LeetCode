class Solution {
    public int climbStairs(int x) {
        if (x<=3) return x;
        int a=3,b=2;
        for (int i=0;i<x-3;i++){
            a =a+b;
            b=a-b;
        }
        return a;
        
    }
}