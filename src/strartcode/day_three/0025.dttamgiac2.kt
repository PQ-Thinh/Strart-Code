package strartcode.day_three

import kotlin.math.sqrt

fun main(){
    print("Input a: ")
    val a:Int = readln().toInt()
    print("Input b: ")
    val b:Int = readln().toInt()
    print("Input c: ")
    val c:Int = readln().toInt()
    val p = (a+b+c).toFloat()/2

    println("chu vi: "+(a+b+c))
    println("dien tich: ${String.format("%.3f",sqrt(p*(p-a)*(p-b)*(p-c)))}")

}