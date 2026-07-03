class Solution {
    public void reverseString(char[] arr) {
        int initial =0;
        int last = arr.length-1;
         while ( initial < last){
            char temp = arr[initial];
            arr[initial]=arr[last];
            arr[last]= temp;
            initial++;
            last--;

        }
    }
}