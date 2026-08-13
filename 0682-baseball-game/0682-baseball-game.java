class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int n= operations.length;
        for(int i=0;i<n;i++){
            String s =  operations[i];
            if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("C")) st.pop();
            else if(s.equals("+")){
                int top= st.pop();
                int sectop=st.peek();
                int res=top+sectop;
                st.push(top);
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(s));
            }
           
        }
         int res=0;
            while(!st.isEmpty()){
                res+=st.pop();
            }
        return res;    
        
    }
}