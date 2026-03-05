package strartcode.day_six

fun main1(){
    print("input h: ")
    val h:Int = readln().toInt()
    for(i in 1..h){
        for (j in 1..i){
            print("*")
        }
        println()
    }
}
fun main2(){
    print("input h: ")
    val h:Int = readln().toInt()
    for(i in h downTo  1){
        for (j in i..h){
            print("*")
        }
        println()
    }
}
fun main(){
    print("input n:")
    val n:Int = readln().toInt()
    for( i in 1 .. n){
        for (j in 1..i)
        {
            print(j)
        }
        println()
    }
}