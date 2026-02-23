package strartcode.day_five

fun main(){
    print("n: ")
    val n = readln().toInt()
    var count = 0
    for(i in 1..n){
        if(n%i==0){
            count++
        }
    }
    println(count)
}