
class Solution {
    public TreeNode buildTree(int[] pre, int[] in) {
          if(in==null|| pre==null || in.length!=pre.length) return null;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i< in.length;i++){
           hm.put(in[i], i);
        }
        return  build(in,  0,  in.length-1,   pre,  0,    pre.length-1 ,   hm);
    }
     public  TreeNode build(int[] in, int is,int ie, int[] pre, int ps, int pe, HashMap<Integer, Integer> hm){
    if(ps>pe || is>ie) return null;
    TreeNode root= new TreeNode(pre[ps]);
    int inro= hm.get(pre[ps]);
    int numl= inro-is;
    root.left = build(in, is, inro - 1, pre, ps + 1, ps + numl, hm);
    root.right = build(in, inro + 1, ie, pre, ps + numl + 1, pe, hm);
     return root;
    }
}