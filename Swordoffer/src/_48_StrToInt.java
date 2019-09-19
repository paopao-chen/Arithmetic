import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--09--03  19:37
 */
public class _48_StrToInt {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0)
            return 0;

        int reslut = 0;
        char first = str.charAt(0);
        if (first == '-') {
            reslut = paraseInt(str,1,false);
        } else if (first == '+') {
            reslut = paraseInt(str,1,true);
        } else if (isDigit(first)) {
            reslut = paraseInt(str,0,true);
        } else {
            reslut = 0;
        }

        return reslut;
    }

    private int paraseInt(String str, int i, boolean flag) {
        if (i >= str.length())
            return 0;

        int res = 0;
        long temp = 0;
        while (i < str.length()) {
            if (!isDigit(str.charAt(i)))
                return 0;
            temp = temp * 10 + str.charAt(i) - '0';    //-'0' 是转化为int类型
            if (temp > 0x8000_0000L)
                return 0;
            i ++;
        }

        if (flag) {  //正数
            if (temp >= 0x8000_0000L)
                return 0;
            else
                res = (int) temp;
        } else {  //负数
            if (temp == 0x8000_0000L)
                res = 0x8000_0000;
            else
                res = (int) (0 - temp);
        }
        return res;
    }


    private boolean isDigit(char c) {
        return c >= '1' && c <= '9';
    }
}
