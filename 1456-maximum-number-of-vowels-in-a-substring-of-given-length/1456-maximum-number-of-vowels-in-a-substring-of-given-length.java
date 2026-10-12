class Solution {
    public int maxVowels(String s, int k) {
        int max=Integer.MIN_VALUE;
        int count=0;
        char[]  str= s.toCharArray();
        for(int i =0;i<k;i++){
          if(str[i]=='a'|| str[i]=='e'|| str[i]=='i'||str[i]=='o'|| str[i]=='u') count++;
        }
        max=Math.max(count,max);
        // count=0;
        for(int i=k;i<str.length;i++){
            char left = str[i - k];
            if (left == 'a' || left == 'e' || left == 'i' || left == 'o' || left == 'u') {
                count--;
            }
             char right = str[i];
             if (right == 'a' || right == 'e' ||  right == 'i' || right == 'o' ||  right == 'u') {
                count++;
            }
            max = Math.max(max, count);
        }
     return max;
    }
}