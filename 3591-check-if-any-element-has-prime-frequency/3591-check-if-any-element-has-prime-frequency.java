class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        for(int ele : map.keySet()){
            int r = map.get(ele);
            int count =0;
            for(int i =1;i<=r;i++){
                if(r%i==0) count++;
            }
            if(count ==2) return true;
        }
        return false;
    }
}