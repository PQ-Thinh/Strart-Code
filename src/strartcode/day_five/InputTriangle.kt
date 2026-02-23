package strartcode.day_five

fun main(){
    print("h: ")
    val h = readln().toInt()
    for (i in h downTo 1){
        for (j in i-1..<h){
            print("*")
        }
        println()
    }
}