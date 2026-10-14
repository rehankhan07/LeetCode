
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result= new LinkedList<>();
        if(root==null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty()){
         TreeNode tmp = q.poll();
         if(tmp!=null){
            max=Math.max(tmp.val,max);
            if(tmp.left!=null) q.offer(tmp.left);
            if(tmp.right!=null) q.offer(tmp.right);
         }
         else{
            result.add(max);
             max = Integer.MIN_VALUE;
             if(!q.isEmpty()) q.offer(null);
         }
        }
        return result;
    }
}