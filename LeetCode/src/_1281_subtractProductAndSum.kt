/**
@author Politeness Chen
@create 2020--04--24  22:33

给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 */
class _1281_subtractProductAndSum {
    fun main(args: Array<String>) {

    }

    fun subtractProductAndSum(n: Int): Int {
        var res = n
        var dupli = 1
        var sum = 0
        while (res > 0) {
            dupli *= res % 10
            sum += res % 10
            res /= 10
        }
        return dupli - sum
    }
}