class Solution {
    public boolean isSubsequence(String s, String t) {
    //   if(s.length()==0 || t.length()==0) return false;
        int sp=0;
        int tp=0;
        int count = 0;
        while (sp < s.length() && tp < t.length() ){
         if(s.charAt(sp) == t.charAt(tp)) {
            sp++;
            // tp++;
            count++;
         }
            tp++; 
        }
        if(count == s.length()) return true;
        return false;

    }
}