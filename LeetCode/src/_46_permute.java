import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2019--10--19  20:02
 */
public class _46_permute {
    //递归交换
    /*public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0)
            return res;
        all(nums,0,res);
        Collections.
    }

    private void all(int[] nums, int i, List<List<Integer>> res) {
        for (int j = 0; j < nums.length; j++) {
            if (i == nums.length - 1) {
                List<Integer> list = new ArrayList<>();
                for (int k = 0; k < nums.length; k++) {
                    list.add(nums[k]);
                }
                if (!res.contains(list)) {
                    res.add(list);
                }
            } else {
                swap(nums,i,j);
                all(nums,i+1,res);
                swap(nums,i,j);
            }

        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }*/

    //回溯
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0)
            return res; 
        boolean[] visited = new boolean[len];
        permution(nums,visited,0,len,new Stack<Integer>(),res);
        return res;
    }

    private void permution(int[] nums, boolean[] visited, int index, int len, Stack<Integer> path, List<List<Integer>> res) {
        if (index == len) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                path.push(nums[i]);
                visited[i] = true;
                permution(nums,visited,index + 1,len,path,res);
                path.pop();
                visited[i] = false;
            }
        }
    }

}
