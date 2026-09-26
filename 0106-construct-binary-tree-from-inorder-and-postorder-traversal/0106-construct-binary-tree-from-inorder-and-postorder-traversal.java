
class Solution {
    public TreeNode buildTree(int[] in, int[] po) {
        if(in==null|| po==null || in.length!=po.length) return null;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i< in.length;i++){
           hm.put(in[i], i);
        }
        return  build(in, po,0, in.length-1, 0, po.length-1, hm);
    }
    public  TreeNode build(int[] in, int[] po,int is,int ie, int ps, int pe, HashMap<Integer, Integer> hm){
    if(ps>pe || is>ie) return null;
    TreeNode root= new TreeNode(po[pe]);
    int inro= hm.get(po[pe]);
    int numl= inro-is;
   root.left = build(in, po, is, inro-1, ps, ps+numl-1, hm);
   root.right = build(in, po, inro+1, ie, ps+numl, pe-1, hm);
     return root;
    }
}