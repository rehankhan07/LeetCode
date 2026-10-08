class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i =0;i< nums.length;i++){
        if(map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
        else map.put(nums[i],1);
    }
    ArrayList<Integer> arr= new ArrayList<>();
    for(Map.Entry<Integer,Integer> e: map.entrySet()){
        int num= e.getKey();
        int rep= e.getValue();
        if(rep< k){
            for(int i =0;i<rep;i++) {
                arr.add(num);
            }
        }
        else{
           for(int i =0;i<k;i++){
            arr.add(num);
           }
        }
       
    }
    Collections.sort(arr);
    int[] res = new int [arr.size()];
    for(int i=0;i<arr.size();i++){
        res[i]=arr.get(i);
    }
    return res;
    }
}