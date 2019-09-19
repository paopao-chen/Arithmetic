import java.util.Arrays;

/**
 * @author Politeness Chen
 * @create 2019--08--12  18:20
 */
public class _1046_lastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if (stones.length < 0) return 0;
        if (stones.length == 1) return stones[0];
        int weight = 0;
        for (int i = 0; i < stones.length-1; i++) {//n-1次
            Arrays.sort(stones);
            weight = stones[stones.length-1] - stones[stones.length-2];
            stones[stones.length-1] = 0;
            stones[stones.length-2] = weight;
        }
        return weight;
    }
}
