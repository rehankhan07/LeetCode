
class Solution {
    public List<Integer> postorder(Node root) {
     LinkedList<Integer> arr = new LinkedList<>();
     preorder(root,arr);
     return arr;   
    }
      public void preorder(Node root, List<Integer> arr) {
    if(root == null) return;
     for(Node child : root.children) {
        preorder(child, arr);
    }
     arr.add(root.val);
    }
}