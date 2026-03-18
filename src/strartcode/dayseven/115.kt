package strartcode.dayseven

import kotlin.math.sqrt

fun main(){
    print("Input N: ")
    val n = readln().toInt()
    print("Input x: ")
    val x = readln().toInt()

    println(mu(n,x))
}

fun mu(n:Int,x:Int):Int{
    return if(n<=0 || sqrt(x.toFloat()).toInt()<=0){
        1
    }else{
        mu(n-1,x)*x
    }
}