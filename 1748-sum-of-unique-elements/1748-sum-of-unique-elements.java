class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
           else map.put(nums[i],1);
        }
        for(int ele:map.keySet()){
          if(map.get(ele)==1){
            sum+=ele;
          }
        }
       
    return sum;
    }
}