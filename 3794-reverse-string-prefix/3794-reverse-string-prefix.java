class Solution {
    public String reversePrefix(String s, int k) {
        if(k==1) return s;
       String p = "";
       for(int i =0;i<k;i++){
        p+=s.charAt(i);
       } 
       String rev = new StringBuilder(p).reverse().toString();
        String af = s.substring(k);
      return rev+af;
    }
}