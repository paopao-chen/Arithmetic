/**
 * @author Politeness Chen
 * @create 2019--10--02  20:56
 */
public class _105_buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    public TreeNode construct(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if(startPre > endPre || startIn > endIn)   //在这里判断!!
            return null;
        TreeNode root = new TreeNode(pre[startPre]);
        int index = startIn;
        while (pre[startPre] != in[index]) {
            index ++;
        }
        root.left = construct(pre,startPre+1,index-startIn+startPre,in,startIn,index-1);
        root.right = construct(pre,index-startIn+startPre+1,endPre,in,index+1,endIn);

        return root;
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
