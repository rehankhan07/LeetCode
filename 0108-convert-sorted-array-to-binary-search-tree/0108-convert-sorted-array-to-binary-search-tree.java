
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length-1;
        return convert(nums,0,n);
    }
     public TreeNode convert(int[] nums,int low, int high) {
        if(low>high) return null;
        int mid = low+(high-low)/2;
        TreeNode  root = new TreeNode (nums[mid]);
       root.left= convert(nums,low,mid-1);
       root.right=convert(nums,mid+1,high);
       return root;
    }

}