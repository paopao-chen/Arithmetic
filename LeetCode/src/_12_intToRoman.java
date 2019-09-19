import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--06--22  21:14
 */
public class _12_intToRoman {
    public String intToRoman(int num) {
        int nums[] = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String romans[] = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < nums.length ; i++) {
            while (num >= nums[i]) {
                num -= nums[i];
                str.append(romans[i]);
            }
        }
        return str.toString();
    }

    @Test
    public void te(){
        String num = "11.1011";
        String[] split = num.split("\\.");
        if (split[0].equals(num)) {
            System.out.println(split[0]);
        }
        else
        System.out.println(1);
    }

    @Test
    public void t(){
        String num = "1101";
        int i = num.length();
        System.out.println(i);
        num = num.replaceFirst("1","11");
        int j = num.length();
        System.out.println(j);
        System.out.println(num);
    }
}
