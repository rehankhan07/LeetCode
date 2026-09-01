class Solution {
    public List<Integer> majorityElement(int[] arr) {
    ArrayList<Integer> nums= new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    int x=arr.length/3;
    for(int i =0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);
        }
    }
    for(int res:map.keySet()){
        if(map.get(res)>x){
          nums.add(res);
        }
    }
    return nums;
    }
}