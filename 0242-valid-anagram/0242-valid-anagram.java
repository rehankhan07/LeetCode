class Solution {
    public boolean isAnagram(String s1, String s2) {
           if(s1.length()!=s2.length()) return false;
         char[] arr1=s1.toCharArray();
          char[] arr2=s2.toCharArray();
          Arrays.sort(arr1);
          Arrays.sort(arr2);
          for(int i=0;i<arr1.length;i++){
              if(arr1[i]!=arr2[i]){
                  return false;
              }
            }
          return true;
        //   if (s.length()!=t.length())return false;
        // Map<Character, Integer> maps = new HashMap<>();
        // Map<Character, Integer> mapt = new HashMap<>();
        // for (int i=0;i<s.length();i++){
        //     char q= s.charAt(i);
        //     if (!maps.containsKey(q)) maps.put(q,1);
        //     else {
        //         maps.put(q, maps.get(q)+1);
        //     }
        // }
        // for (int j=0;j<t.length();j++){
        //     char w= t.charAt(j);
        //     if (!mapt.containsKey(w)) mapt.put(w,1);
        //     else {
        //         mapt.put(w, mapt.get(w)+1);
        //     }

        // }
        // for (char key : maps.keySet()) {
        //     if (!mapt.containsKey(key) || !maps.get(key).equals(mapt.get(key))) {
        //         return false;
        //     }
        // }
        // return true;
    }
}