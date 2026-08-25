class Solution {
    public String removeKdigits(String s, int k) {
        if(k==s.length()) return "0";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            while(!st.isEmpty() && k>0 && (st.peek()-'0') > (s.charAt(i)-'0')){
                st.pop();
                k=k-1;
            }
            st.push(s.charAt(i));  
        }
           while(k>0){
            st.pop();
            k--;
           }
        String r = "";

        while(!st.isEmpty()){
            r += st.pop();
        }

        // Reverse because stack gives characters backwards
        r = new StringBuilder(r).reverse().toString();

        // Remove leading zeros
        int i = 0;
        while(i < r.length() && r.charAt(i) == '0'){
            i++;
        }

        if(i == r.length()) return "0";

        return r.substring(i);
    }
}