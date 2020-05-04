/**
@author Politeness Chen
@create 2020--05--04  21:03
 */
class _1021_removeOuterParentheses {
    fun main(args: Array<String>) {}

    fun removeOuterParentheses(S: String): String {
        var count: Int = 0
        var res: String = ""
        for (i in S) {
            if (i == '(' && count++ > 0) {
                res += "("
            }
            if (i == ')' && --count > 0) {
                res += ")"
            }
        }
        return res
    }
}