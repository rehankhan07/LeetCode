class Solution {
    public int[] sortArrayByParity(int[] arr) {
         ArrayList<Integer> res = new ArrayList<>();
         for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) res.add(arr[i]);
         }
          for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) res.add(arr[i]);
         }
       int [] ans = new int [arr.length];
       for(int i=0;i<arr.length;i++){
        ans[i]=res.get(i);
        
       }
       return ans;
    }
}