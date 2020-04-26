/**
 * @author Politeness Chen
 * @create 2020--04--26  21:25
 */
class _1295_findNumbers {
    fun findNumbers(nums: IntArray): Int {
        var count: Int = 0
        for (i in nums) {
            if (i.toString().length % 2 == 0) {
                count++
            }
        }
        return count
    }
}