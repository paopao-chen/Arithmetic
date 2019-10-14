/**
 * @author Politeness Chen
 * @create 2019--10--14  21:15
 */
public class _771_numJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        char[] Jc = J.toCharArray();
        char[] Sc = S.toCharArray();
        int[] num = new int[122];
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            num[Sc[i]] = num[Sc[i]] + 1;
        }
        for (int i = 0; i < J.length(); i++) {
            count += num[Jc[i]];
        }
        return count;
    }
}
