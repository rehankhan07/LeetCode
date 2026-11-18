class Solution {
    public int search(int[] arr, int k) {
    int start=0;
    int end = arr.length-1;
    while(start<=end){
        int mid = start+(end-start)/2;
      if(arr[mid] == k) {
                return mid;
            }
            else if(arr[mid] < k) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
    }
    return -1;
    }
}