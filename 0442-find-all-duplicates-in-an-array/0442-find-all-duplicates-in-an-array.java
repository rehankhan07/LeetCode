class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        ArrayList<Integer> arr= new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        
        if(set.contains(nums[i])){
            arr.add(nums[i]);
        }
        set.add(nums[i]);

       }
        return arr;
    }
}