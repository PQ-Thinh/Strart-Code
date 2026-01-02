package dayone

import kotlin.math.sqrt

fun main(){
//    var a:Int
//    var h:Float
//    while (true){
//        print("a = ")
//        a = readln()!!.toInt()
//        print("h = ")
//        h= readln()!!.toFloat()
//        println("S = "+String.format("%.2f",(a*(h/2))))
//        if (a==0) break
//    }
    tamgiac2()
}
fun tamgiac2():Float{
    var a:Float
    var b:Float
    var c:Float
    while (true){
        print("a = ")
        a = readln()!!.toFloat()
        print("b = ")
        b = readln()!!.toFloat()
        print("c = ")
        c = readln()!!.toFloat()
        var p:Float=(a+b+c)/2
        println("C = "+String.format("%.3f",p*2))
        println("S = "+String.format("%.2f", sqrt((p*(p-a)*(p-b)*(p-c)))))
    }

}