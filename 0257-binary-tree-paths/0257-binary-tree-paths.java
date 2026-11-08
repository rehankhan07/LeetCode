
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        solve(root, "", ans);
        return ans; 
    }
    void solve(TreeNode root, String s, List<String> ans) {
        if (root == null) return;
        s += root.val;
        if (root.left == null && root.right == null) {
            ans.add(s);
            return;
        }
        solve(root.left, s + "->", ans);
        solve(root.right, s + "->", ans);
    }
}