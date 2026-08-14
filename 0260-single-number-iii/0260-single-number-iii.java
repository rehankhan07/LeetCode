class Solution {
    public int[] singleNumber(int[] arr) {
     ArrayList<Integer> nums = new ArrayList<>();
     HashMap<Integer, Integer> map = new HashMap<>(); 
    for (int num : arr) {
    map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int num : arr) {
    if (map.get(num) == 1) {
       nums.add(num);
    }
    }
    int [] res= new int [nums.size()];
    for(int i=0;i<nums.size();i++){
        res[i]=nums.get(i);
    }

       return res; 
    }
}