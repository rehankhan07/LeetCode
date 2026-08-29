class Solution {
      public boolean isvovel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char []ch = s.toCharArray();
        int start=0;
        int end = s.length()-1;
        while(start<end){
            if(!isvovel(ch[start])) start++;
            else if(!isvovel(ch[end])) end--;
            else{
                char temp= ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
    //    String k ="";
    //    for(int i=0;i<ch.length;i++){
    //     k+=ch[i];
    //    }
    //    return k;
    return String.valueOf(ch);
    }
  
}