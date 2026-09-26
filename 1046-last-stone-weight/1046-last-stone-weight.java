class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int ele: arr){
        pq.add(ele);
       }
       while(pq.size()>1){
        int f=pq.remove();
        int l=pq.remove();
        int m= f-l;
       if(m!=0)  pq.add(m);
       if(pq.isEmpty()) return 0;
       }
       return pq.peek();
    }
}