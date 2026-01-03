package strartcode.dayone

import java.text.DecimalFormat

fun main(){
    print("Input a: ")
    val a:Int = readln().toInt()
    print("Input b: ")
    val b:Int = readln().toInt()
    val df = DecimalFormat("#.######")
    val P:Int = 21*a + 5*b -2009
    val Q: Double = (21*Math.pow(a.toDouble(),2.0)-5*b)/(2009*Math.pow(b.toDouble(),2.0))
    val R: Double = (21*a +5*Math.pow(b.toDouble(),2.0))/(2009*b+15)
    print(" "+P+" "+df.format(Q)+ "\n" + df.format(R))
}