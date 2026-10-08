class Solution {
    public int firstMatchingIndex(String s) {
       char[] ch = s.toCharArray();
       int n = ch.length;
       for(int i =0;i< ch.length;i++){
        if(ch[i] == ch[n - i - 1]) return i;
       }
       return -1;
    }
}