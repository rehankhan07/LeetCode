class Solution {
    public boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        char[] one = s1.toCharArray();
        char[] two = s2.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        return Arrays.equals(one,two);
       
    }
}