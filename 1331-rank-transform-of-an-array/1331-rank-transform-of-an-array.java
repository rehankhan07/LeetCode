class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] ch = new int [arr.length];
        for(int i =0;i< arr.length;i++){
            ch[i]=arr[i];
        }
        Arrays.sort(ch);
        int rank=1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i< arr.length;i++){
             if (!map.containsKey(ch[i])) {
                map.put(ch[i], rank);
                rank++;
            }
        }
       for(int i =0;i< arr.length;i++){
        arr[i]= map.get(arr[i]);
       }
       return arr;
    }

}