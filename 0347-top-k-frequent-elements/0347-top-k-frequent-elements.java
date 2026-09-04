class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i =0;i<nums.length;i++) {
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
        else map.put(nums[i],1);
       }
       int [] arr= new int [k];
         for(int i = 0; i < k; i++) {
            int maxFreq = 0;
            int maxElement = 0;
            for(int key : map.keySet()) {
                if(map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxElement = key;
                }
            }
            arr[i] = maxElement;
            map.remove(maxElement);
        }
        return arr;
    }
}