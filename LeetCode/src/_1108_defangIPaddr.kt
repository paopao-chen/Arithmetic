/**
 * @author Politeness Chen
 * @create 2020--04--27  22:02
 */
class _1108_defangIPaddr {
    fun main(str: Array<String>) {}
    fun defangIPaddr(address: String): String {
        var res: String = ""
        for (i in address) {
            res += if (i == '.') {
                "[.]"
            } else {
                i
            }
        }
        return res
    }
}