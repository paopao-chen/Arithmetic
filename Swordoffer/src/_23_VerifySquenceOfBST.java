import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--09--20  18:23
 *
 * 判断是否为二叉搜索树的后序遍历
 */
public class _23_VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0 || sequence == null) return false;
        return judge(sequence,0,sequence.length-1);
    }

    private boolean judge(int[] seq,int left,int right) {
        if (left >= right) return true;  //空树或叶子节点
        int i = right;
        while (i > left && seq[i-1] > seq[right]){
            i --;
        }  //i是右子树的开始节点
        for (int j = i-1; j >= left; j--) {
            if (seq[j] > seq[right]){
                return false;
            }
        }
        return judge(seq, left, i - 1) && (judge(seq, i, right - 1));
    }

    @Test
    public void t(){
        int[] num = {4,8,6,12,16,14,10};
        System.out.println(VerifySquenceOfBST(num));
    }
}
