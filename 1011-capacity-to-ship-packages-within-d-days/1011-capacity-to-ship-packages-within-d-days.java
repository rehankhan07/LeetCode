class Solution {
    public int shipWithinDays(int[] weights, int da) {
        int mincap=0;
        int maxcap=0;
        for(int ele: weights){
         mincap=Math.max(mincap,ele);
         maxcap+=ele;
        }
        while(mincap<maxcap){
            int mid= mincap+(maxcap-mincap)/2;
            int days=1;
            int sum=0;
            for(int ele:weights){
                if(sum+ele >mid){
                    days++;
                    sum=0;
                } 
                sum+=ele;
            }
            if(days>da) mincap=mid+1;
            else maxcap=mid;
        }
        return mincap;
    }
}