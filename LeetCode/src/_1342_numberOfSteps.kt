/**
@author Politeness Chen
@create 2020--04--23  18:16

给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1
 */
class _1342_numberOfSteps {
    fun main(args: Array<String>) {

    }
    fun numberOfSteps (num: Int): Int {
        var count = 0
        var number = num
        while (number > 0) {
            if (number % 2 == 0) {
                number /= 2
            } else {
                number -= 1
            }
            count ++
        }
        return count
    }
}