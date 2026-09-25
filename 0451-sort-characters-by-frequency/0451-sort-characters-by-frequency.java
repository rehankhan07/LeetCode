class Solution {
    public String frequencySort(String s) {
    if(s.length()<=2) return s;
    HashMap<Character,Integer> map = new HashMap<>();
     for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(map.containsKey(ch)){
         map.put(ch,map.get(ch)+1);
        }
        else map.put(ch,1);
     }
     ArrayList<Integer> arr = new ArrayList<>();
     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        int frequency = entry.getValue();
        arr.add(frequency);
      }
    Collections.sort(arr);
    String res="";
    for (int i = arr.size() - 1; i >= 0; i--) {
         int freq = arr.get(i);
       for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() == freq) {
            char ch = entry.getKey();
            for (int j = 0; j < freq; j++) {
                res += ch;
            }
            map.remove(ch);
            break;
        }
    }
    }
    return res;
    }
}