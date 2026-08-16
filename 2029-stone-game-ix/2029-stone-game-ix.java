class Solution {
    public boolean stoneGameIX(int[] stones) {
        int z=0;
        int o=0;
        int t=0;
        for(int x:stones){
            if(x%3==0) z++;
            else if(x%3==1) o++;
            else t++;
        }
        if (z % 2 == 0) {
            return o > 0 && t > 0;
        }
        return Math.abs(o - t) > 2;  
    }
}