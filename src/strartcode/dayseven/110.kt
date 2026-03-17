package strartcode.dayseven

import kotlin.math.sqrt

fun main(){
    print("Input N: ")
    val n:Int = readln().toInt()
    if(prime(n) && prime(n+2)){
        print("Yes")
    }else{
        print("No")
    }


}

fun prime(k:Int):Boolean{
    for(i in 2..sqrt(k.toFloat()).toInt()){
        if(k%i==0){
            return false
        }
    }
    return true
}