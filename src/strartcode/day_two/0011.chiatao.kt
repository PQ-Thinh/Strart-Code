package strartcode.day_two

fun main(){
    print("Hs: ")
    val hs:Int = readln().toInt()
    print("T: ")
    val t:Int = readln().toInt()
    print("Số táo học sinh mà mỗi học sinh nhận được sau khi chia đều "+t+
            " quả táo cho "+hs+" em là:"+(t/hs)+" quả và số táo còn dư là: "
    +(t%hs)+" quả")
}