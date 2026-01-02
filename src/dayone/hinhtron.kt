package dayone

import kotlin.math.PI

fun main(){
    var radius:Int
    while (true){
        print("radius = ")
        radius= readln()!!.toInt()
        println("Perimeter: "+String.format("%.2f", 2 * PI * radius))
        println("Area: "+String.format("%.2f",PI*radius*radius))
        if (radius==0)
            break
    }
}