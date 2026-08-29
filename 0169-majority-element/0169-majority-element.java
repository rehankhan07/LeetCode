class Solution {
    public int majorityElement(int[] arr) {
        int n= arr.length/2;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i =0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
             map.put(arr[i],1);
        }
       }
       for (int key : map.keySet()) {
        if (map.get(key) > n) {
        return key;
         }
       }
       return -1;
        //    int count =0;
        // int candidate = -1;
        // for(int num : arr){
            
        //     if(count == 0){
        //         candidate = num;
        //     }
        //     if(num == candidate){
        //         count++;
        //     } else{
        //         count--;
        //     }
        // }
        
        // count = 0;
        // for(int num : arr){
        //     if(num == candidate){
        //         count++;
        //     }
        // }
        // if(count > arr.length/2){
        //     return candidate;
        // }
        
        // return -1;
    }
}