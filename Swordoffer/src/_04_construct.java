import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--08--22  20:48
 *
 * 根据中序和前序重建二叉树并返回
 */
public class _04_construct {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }

    public TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if(startPre > endPre || startIn > endIn)   //在这里判断!!
            return null;
        TreeNode root = new TreeNode(pre[startPre]);

        for (int i = startIn; i <= endIn; i++) {
            if (pre[startPre] == in[i]) {
                root.left = reConstructBinaryTree(pre,startPre+1,i-startIn+startPre,in,startIn,i-1);
                root.right = reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
                break;
            }
        }

        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    @Test
    public void s(){
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {3,2,4,1,6,5,7};
        System.out.println(reConstructBinaryTree(a,b));
    }
}
