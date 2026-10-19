class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr = new ArrayList<>();
        for(int i =0;i< words.length;i++){
            String wow= words[i];
            if(wow.contains(String.valueOf(x))){
                arr.add(i);
            }
        }
        return arr;
    }
}