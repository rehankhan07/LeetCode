
class Solution {
    public TreeNode balanceBST(TreeNode root) {
      ArrayList<Integer> arr = new ArrayList<>();
      inorder(root,arr);
      return build(arr,0,arr.size()-1);

    }
    public TreeNode build( ArrayList<Integer> arr,int low, int high){
    if(low>high) return null;
    int mid= low+(high-low) /2;
    TreeNode root = new TreeNode(arr.get(mid));
    root.left=build(arr,low,mid-1);
    root.right= build(arr,mid+1,high);
    return root;
    }

    public void inorder(TreeNode root, ArrayList<Integer> arr ){
        if(root==null) return;
          inorder(root.left,arr);
          arr.add(root.val);
          inorder(root.right,arr);
    }
}
