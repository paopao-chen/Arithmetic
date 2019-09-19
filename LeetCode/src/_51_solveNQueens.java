import java.util.ArrayList;
import java.util.List;

/**
 * @author Politeness Chen
 * @create 2019--05--27  22:04
 */
public class _51_solveNQueens {
    public List<List<String>> solveNQueens(int n) {
        queens(0,n,new boolean[n],new int[n]);
        return ans;
    }

    List<List<String>> ans = new ArrayList();

    void queens(int k,int n,boolean[] flag,int[] temp) {
        if (k == n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n ; i++) {   //行
                String s = "";
                for (int j = 0; j < n ; j++) {  //列
                    if (temp[i] == j) {   //第i行存的Q位于第j列
                        s += "Q";
                    } else {
                        s += ".";
                    }
                }
                list.add(s);
            }
            ans.add(list);
            return;
        }

        for (int i = 0; i < n ; i++) {
            if (!flag[i]) {
                //判断它和之前的皇后是否成对角线。
                boolean tag = true;
                // 判断放置第k行的时候，是否与前面的冲突
                for(int last = k-1;last >= 0 ;last--) {  //这里对先前的行进行判断，故不用判断是否在同一行
                    if(temp[last] - i == k - last || i - temp[last] == k - last){  //Math.abs();  绝对值相等即可
                        tag = false;
                        break;
                    }
                }
                if(tag) {
                    flag[i] = true;  //这里进行了判断，放置下一个皇后肯定不在同一列
                    temp[k] = i;
                    queens(k+1,n,flag,temp);
                    flag[i] = false;
                }
            }
        }

    }

}
