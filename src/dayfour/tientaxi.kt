package dayfour

fun main(){
    var yourNumber:Int

    while (true){
        print("yourNumber = ")
        yourNumber = readln()!!.toInt()
        

        val totalPrice = when {
            yourNumber <= 1 -> yourNumber * 15000
            yourNumber in 2..5 -> yourNumber * 13500
            yourNumber > 120 -> (yourNumber * 11000) * 90 / 100 // Giảm 10% nếu lớn hơn 120km
            else -> yourNumber * 11000
        }

        println(String.format("Tổng tiền: %d vnđ", totalPrice))
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}