package strartcode.day_two

fun main(){
    print("Input a: ")
    val a = readln().toInt()
    print("Input b: ")
    val b = readln().toInt()

    print("sum: "+((a%10)+((b%100)/10)))
}