class Solution {
    public int longestPalindrome(String s) {
    int res=0,odd=0;
    HashMap<Character,Integer> map = new HashMap<>();
    for(char ch : s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
        int freq= map.get(ch);
        if(freq %2==0){
            res+=2;
            odd--;
        }
        else odd++;
    }
    if(odd > 0) res+=1;
    return res;
    }
}