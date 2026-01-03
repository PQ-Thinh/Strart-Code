package strartcode.day_two

fun main(){
    print("Input N: ")
    var N = readln().toInt()

    val five = N/5000
    val two = (N%5000)/2000
    val one = (N%5000)%2000/1000
    print("$five $two $one")
}