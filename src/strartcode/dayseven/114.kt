package strartcode.dayseven

fun main(){
    print("Input N: ")
    val n = readln().toInt()

    println(factorial(n))

}

fun factorial(k:Int):Int{
    return if(k<=0){
        1
    }else{
        k*factorial(k-1)
    }
}