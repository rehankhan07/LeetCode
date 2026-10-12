class Solution {
    public int[] finalPrices(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i =arr.length-1;i>=0;i--){
            int price = arr[i];
            while(!st.isEmpty() && st.peek() > arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
              arr[i]=arr[i]-st.peek();
            }
            st.push(price);

        }
        return arr;

    }
}