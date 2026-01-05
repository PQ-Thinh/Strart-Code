package strartcode.day_three

fun main(){
    print("Input a: ")
    val a = readln().toFloat()
    print("Input b: ")
    val b = readln().toFloat()
    print("Input c: ")
    val c = readln().toFloat()
    print("DTB : ${String.format("%.1f",(a*2+b*2+c)/5)}")
}