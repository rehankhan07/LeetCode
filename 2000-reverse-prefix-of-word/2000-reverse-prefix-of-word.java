class Solution {
    public String reversePrefix(String word, char ch) {

        Stack<Character> st = new Stack<>();

        int p = -1;

        for(int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);
            st.push(c);

            if(c == ch) {
                p = i + 1;
                break;
            }
        }

        // ch was not found
        if(p == -1) {
            return word;
        }

        String res = "";

        while(!st.isEmpty()) {
            res += st.pop();
        }

        while(p < word.length()) {
            res += word.charAt(p);
            p++;
        }

        return res;
    }
}