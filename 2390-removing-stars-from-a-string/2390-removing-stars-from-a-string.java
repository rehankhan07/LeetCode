class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0;i< s.length();i++){
            char ch = s.charAt(i);
            if(ch!='*') st.push(ch);
            if(ch=='*' && !st.isEmpty()) st.pop();
        }
        String res="";
        while(!st.isEmpty()){
         res+=st.pop();
        }
        String fi="";
        for(int i = res.length()-1;i>=0;i--){
            fi+=res.charAt(i);
        }
       return fi;
    }
}