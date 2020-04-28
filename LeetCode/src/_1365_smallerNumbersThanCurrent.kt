/**
 * @author Politeness Chen
 * @create 2020--04--28  22:07
 *
 * 有多少小于当前数字的数字
 */
class _1365_smallerNumbersThanCurrent {
    fun main(strs: Array<String>) {}
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        var bucket: IntArray = IntArray(101)
        var res: IntArray = IntArray(nums.size)
        for (i in nums) {
            bucket[i] += 1
        }
        for (i in 1..100) {
            bucket[i] += bucket[i-1]
        }
        for (i in nums.indices) {
            res[i] = if (nums[i] > 0) bucket[nums[i]-1] else 0
        }
        return res
    }
}
