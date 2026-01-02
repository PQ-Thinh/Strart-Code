package daythree

fun main(){
    var score:Float
    while (true){
        print("Score = ")
        score = readln()!!.toFloat()
        when{
            score>=9.0-> println("Học sinh xếp loại: Xuất sắc")
            score>=8.0-> println("Học sinh xếp loại: Giỏi")
            score>=5.5-> println("Học sinh xếp loại: Khá")
            score>=4.0-> println("Học sinh xếp loại: Trung bình")
            score<4.0-> println("Học sinh xếp loại: Yếu")
        }
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}