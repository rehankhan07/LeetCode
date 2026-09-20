class Solution {
    public int findKthPositive(int[] arr, int k) {
     int check=1;
     ArrayList<Integer> num = new ArrayList<>();
     for(int i=0;i<arr.length;i++){
        while (check < arr[i]) {
                num.add(check);
                check++;
            }
            check++;
     }
      while (num.size() < k) {
            num.add(check);
            check++;
        }
     return num.get(k-1);
    }
}