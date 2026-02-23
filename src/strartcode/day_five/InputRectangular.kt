package strartcode.day_five

fun main(){
    print("Chieu Dai: ")
    val a = readln().toInt()
    print("Chieu Rong: ")
    val b = readln().toInt()

    for (i in 1..b){
        for (j in 1..a){
            print("*")
        }
        println()
    }
}