class Solution {
    public int minAddToMakeValid(String s) {
        int op=0;
        int add =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') op++;
            else{
                if(op>0) op--;
                else{
                      add++;
                }
               
            }
        }
        return op+add;
    }

}