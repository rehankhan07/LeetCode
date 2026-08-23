class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int e:nums) {
            set.add(e);
        }
        int maxstre=0;
        for(int num: set){
            if(!set.contains(num-1)){
                int cur = num;
                int curstr=1;
                while(set.contains(cur+1)){
               curstr++;
               cur++;
                }
                 maxstre = Math.max(curstr,maxstre);
            }
           
        }
        return maxstre;
    }
}