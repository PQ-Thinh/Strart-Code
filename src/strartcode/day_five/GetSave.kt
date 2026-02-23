package strartcode.day_five

fun main(){
    print("Nhap so Tien hien co: ")
    var a = readln().toInt()
    print("Nhap so Tien Can co: ")
    var b = readln().toInt()

    var month:Int=0
    while (a<=b){
        a += (a*2/100)
        month++
    }
    println(month)
}