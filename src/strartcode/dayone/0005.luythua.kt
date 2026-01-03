package strartcode.dayone

fun main(){
    print("Input a: ")
    val a:Int = readLine()!!.toInt()
    var B1: Double = Math.pow(a.toDouble(), 2.0)
    var B2: Double = Math.pow(a.toDouble(), 5.0)
    print("B1 = "+B1 + "\n"+"B2 = "+B2)
}