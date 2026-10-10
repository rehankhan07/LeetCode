class Solution {
    public int divisorSubstrings(int number, int k) {
    int count =0;
    String num =  String.valueOf(number);
    for(int i =0;i<= num.length()-k;i++){
         String sub =num.substring(i, i+k);
         int divisor = Integer.parseInt(sub);
         if (divisor != 0 && number % divisor == 0) {
        count++;
         }
    }
    return count;
    }
}