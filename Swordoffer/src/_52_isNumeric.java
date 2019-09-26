/**
 * @author Politeness Chen
 * @create 2019--09--26  20:49
 */
public class _52_isNumeric {
    private int index = 0;
    public boolean isNumeric(char[] str) {
        /*//正则表达式的写法
        String string = String.valueOf(str);
        return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");*/

        if (str.length < 1)
            return false;
        // 标记符号、小数点、e是否出现过
        boolean sign = false,decimal = false,hasE = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'e' || str[i] == 'E') {
                if (i == str.length-1) return false;
                if (hasE) return false;
                hasE = true;
            } else if (str[i] == '+' || str[i] == '-') {
                if (sign && str[i-1] != 'e' && str[i-1] != 'E') return false;
                if (!sign && i > 0 && str[i-1] != 'e' && str[i-1] != 'E') return false;
                sign = true;
            } else if (str[i] == '.') {
                if (hasE || decimal) return false;
                decimal = true;
            } else if (str[i] < '0' || str[i] > '9') {
                return false;
            }
        }
        return true;
    }

}
