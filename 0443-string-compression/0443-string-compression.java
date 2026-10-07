class Solution {
    public int compress(char[] arr) {
     if(arr.length==1) return 1;
     int l=0;
     int r=0;
     String res="";
      while (r < arr.length) {
            char ch = arr[l];
            while (r < arr.length && arr[r] == ch) {
                r++;
            }
            res += ch;
            int count = r - l;
            if (count > 1) {
                res += count;
            }
            l = r;
        }
      for(int i =0;i<res.length();i++){
         arr[i]= res.charAt(i);
      }
      return res.length();

    }
}