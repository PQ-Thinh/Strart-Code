package daythree

fun main(){
    var yourAge:Int
    while (true){
        print("yourAge = ")
        yourAge = readln()!!.toInt()
        when{
            yourAge>=15-> println("Bạn được xem phim Thế giới lập trình")
            yourAge<15-> println("Bạn KHÔNG được xem phim Thế giới lập trình")
        }
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}