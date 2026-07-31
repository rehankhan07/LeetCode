class Solution {
    public boolean isValid(String s) {
          Stack<Character> st= new Stack<>();
        int n= s.length();
        for (int i=0;i<n;i++){
            char ch =s.charAt(i);
            if (ch=='('||ch=='['|| ch=='{'){
                st.push(ch);
            }
            if(ch==')'){
                if (st.isEmpty()) return false;
                if(st.peek()!='('){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
             if(ch==']'){
                 if (st.isEmpty()) return false;
                if(st.peek()!='['){
                    return false;
                }
                if(st.peek()=='['){
                    st.pop();
                }
            }
             if(ch=='}'){
                if (st.isEmpty()) return false;
                if(st.peek()!='{'){
                    return false;
                }
                if(st.peek()=='{'){
                    st.pop();
                }
            }
        }    
        return st.isEmpty();
    }
}