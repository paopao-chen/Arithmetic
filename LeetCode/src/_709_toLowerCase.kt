/**
@author Politeness Chen
@create 2020--05--05  21:56
 */
class _709_toLowerCase {
    fun main(args: Array<String>) {}
    fun toLowerCase(str: String): String {
        var res: String = ""
        str.forEach {
            res += if (it in 'A'..'Z') {
                it + 32
            } else {
                it
            }
        }
        return res
    }
}