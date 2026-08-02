class MyQueue {
   Stack<Integer> st = new Stack<>();
     Stack<Integer> hp = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
         while (st.size() > 1) {
        hp.push(st.pop());
    }

    int c = st.pop();

    while (!hp.isEmpty()) {
        st.push(hp.pop());
    }

    return c;
    }
    
    public int peek() {
           while (st.size() > 1) {
        hp.push(st.pop());
    }

    int c = st.peek();

    while (!hp.isEmpty()) {
        st.push(hp.pop());
    }
     return c;
    }
    
    public boolean empty() {
         return st.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */