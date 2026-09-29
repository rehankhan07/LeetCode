
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
       List<Double> arr = new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       q.add(null);
       while(q.peek()!=null){
        double sum =0;
        int nodes=0;
        while(q.peek()!=null){
            TreeNode node = q.remove();
            sum+=node.val;
            nodes++;
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
        }
        q.add(q.remove());
        arr.add(sum/nodes);
       }
       return arr;
    }
}