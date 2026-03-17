package strartcode.dayseven

fun main() {
    print("Input N: ")
    val n = readln().toInt()
    val s = n.toString()
    var isMagic = true

    for (i in 1..s.length) {
        val prefix = s.substring(0, i).toInt()
        if (prefix % i != 0) {
            isMagic = false
            break
        }
    }

    if (isMagic) {
        println("Yes")
    } else {
        println("No")
    }
}
