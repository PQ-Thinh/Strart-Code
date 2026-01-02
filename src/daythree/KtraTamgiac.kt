package daythree

import kotlin.math.sqrt

fun main(){
    var X:Int
    var Y:Int
    var Z:Int
    while (true){
        print("X = ")
        X= readln()!!.toInt()
        print("Y = ")
        Y= readln()!!.toInt()
        print("Z = ")
        Z= readln()!!.toInt()

        when{
            X==Y&&Y==Z-> println("Tam giác đều")
            X==Y||X==Z||Y==Z-> println("Tam giác cân")
            X*X==Y*Y+Z*Z||Y*Y==X*X+Z*Z||Z*Z==X*X+Y*Y-> println("Tam giác vuông")
            else-> println("Tam giác thường:")
        }
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}