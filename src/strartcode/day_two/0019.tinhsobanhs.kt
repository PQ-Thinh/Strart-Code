package strartcode.day_two

fun main(){
    print("Input a: ")
    var a:Int = readln().toInt()
    print("Input b: ")
    var b:Int = readln().toInt()
    print("Input c: ")
    var c:Int = readln().toInt()
    val totalTables = (a + 1) / 2 + (b + 1) / 2 + (c + 1) / 2
    println("Số bàn cần mua: $totalTables")



}