package strartcode.day_six

fun main(){
    print("input a: ")
    var a:Int = readln().toInt()
    print("input b: ")
    val b:Int = readln().toInt()
    var mouth=0
    while(a<b){
        a += (a * 2 / 100)
        mouth++
    }
    println("so thg can dat de du tien choi gai la:"+mouth)
}