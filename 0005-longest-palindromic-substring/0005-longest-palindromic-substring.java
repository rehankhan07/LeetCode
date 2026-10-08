class Solution {
    public String longestPalindrome(String s) {
     String ans = "";
        for (int left = 0; left < s.length(); left++) {
            for (int right = left; right < s.length(); right++) {
                String sub = s.substring(left, right + 1);
                if (check(sub)) {
                    if (sub.length() > ans.length()) {
                        ans = sub;
                    }
                }
            }
        }

        return ans;
    }
    boolean check (String s){
        int l =0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
         return true;
    }
}