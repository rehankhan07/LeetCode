class Solution {
      static String[] codes = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String str) {
     
       if(str.length()==0){
        ArrayList<String> bres= new ArrayList<>();
        bres.add("");
        return bres;
       }
       char ch = str.charAt(0);
String ros = str.substring(1);

List<String> rres = letterCombinations(ros);
ArrayList<String> mres = new ArrayList<>();

String codeforch = codes[ch - '0'];

for (int i = 0; i < codeforch.length(); i++) {
    char chcode = codeforch.charAt(i);

    for (String rstr : rres) {
        mres.add(chcode + rstr);
    }
}    
     return mres;
    }
}