class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           if(!st.isEmpty() && st.peek() == ch){
            st.pop();
           }
           else{
            st.push(ch);
           }
        }
        String r="";
        while(!st.isEmpty()){
         r= st.pop()+r;
        }
        return r;
    }
}