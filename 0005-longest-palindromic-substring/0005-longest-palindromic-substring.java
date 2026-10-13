class Solution {
    public String longestPalindrome(String s) {
    String res="";
    for(int left=0;left< s.length(); left++){
        for(int right= left;right< s.length();right++){
            String sub= s.substring(left,right+1);
             if(check(sub)==true){
                if(sub.length()> res.length()){
                    res=sub;
                }
             }
        }
    }
    return res;
    }
    boolean check(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}