package strartcode.day_three

fun main(){
    print("Input a: ")
    val a:Int = readln().toInt()
    print("Input b: ")
    val b:Int = readln().toInt()
    print("Input c: ")
    val c:Int = readln().toInt()
    print("TBC: ${String.format("%.1f",(a+b+c).toFloat()/3)}")
}