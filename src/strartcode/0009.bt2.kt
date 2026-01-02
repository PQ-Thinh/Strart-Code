package strartcode

import java.text.DecimalFormat
import kotlin.math.sqrt

fun main(){
    print("Input a: ")
    val a:Int = readln().toInt()
    print("Input b: ")
    val b:Int = readln().toInt()
    print("Input c: ")
    val c:Int = readln().toInt()
    val df = DecimalFormat("#.####")
    val P:Double = (21*Math.pow(a.toDouble(),2.0)+5*b*b)/(2009*c*c+15)
    val Q: Double = (sqrt((a*a-2*b).toDouble()))/(3*c*c+4)
    print(""+df.format(P)+" "+df.format(Q))
}