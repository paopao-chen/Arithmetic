/**
 * @author Politeness Chen
 * @create 2019--08--01  14:45
 */
public class _01_find {
    public boolean Find(int target, int [][] array) {
        //二维数组的判空
        if (array == null || array.length == 0 || array[0].length == 0) return false;
        int rows = array.length;
        int cols = array[0].length;
        int row = rows - 1;
        int col = 0;

        while (row >= 0 && row < rows && col >= 0 && col < cols) {
            if (array[row][col] == target) return true;
            else if (array[row][col] < target) col ++;
            else row --;
        }

        return false;
    }
}
