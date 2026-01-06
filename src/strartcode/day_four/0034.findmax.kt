package strartcode.day_four

fun main(){
    print("Input a: ")
    val a:Int = readln().toInt()
    print("Input b: ")
    val b:Int = readln().toInt()
    print("Input c: ")
    val c:Int = readln().toInt()
    val max = if (a > b) (if (a > c) a else c) else (if (b > c) b else c)
    println(max)
}