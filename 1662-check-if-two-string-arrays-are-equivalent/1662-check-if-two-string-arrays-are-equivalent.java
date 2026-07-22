class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      String str = "";
      String stp="";
        for(int i=0;i<word1.length;i++){
            str+=word1[i];
        }
         for(int i=0;i<word2.length;i++){
            stp+=word2[i];
        }
       return str.equals(stp);
    }
}