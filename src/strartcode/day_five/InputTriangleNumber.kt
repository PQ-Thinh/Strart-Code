package strartcode.day_five

fun main(){
    print("n: ")
    val n = readln().toInt()
    for(i in n downTo 1){
        for (j in 1..n+1-i){
            print("$j ")
        }
        println()
    }
}