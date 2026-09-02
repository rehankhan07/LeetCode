class Solution {
    public int timeRequiredToBuy(int[] ticket, int k) {
        int time =0;
        for(int c=0;c<ticket.length;c++){
            if(c<=k){
                time = time+Math.min(ticket[c],ticket[k]);
            }
            else{
                time = time+Math.min(ticket[c],ticket[k]-1);
            }
        
        }
        return time;
    }
}