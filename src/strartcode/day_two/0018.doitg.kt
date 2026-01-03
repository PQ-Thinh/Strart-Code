package strartcode.day_two

fun main(){
    print("Input s: ")
    var s = readln().toInt()

    val h = s/3600
    val m = (s%3600)/60
    val S = (s%3600)%60
    print("$h:$m:$S")
}