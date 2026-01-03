package strartcode.day_two

fun main(){
    print("Input a: ")
    var a:Int = readln().toInt()
    var sum:Int = 0
    var mod:Int
    for(i in 1..a) {
        mod=a%10
        sum+=mod
        a=a/10
    }
    print("sum: "+sum)
}