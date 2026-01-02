package daythree

fun main(){
    var yourNumber:Int
    while (true){
        print("yourNumber = ")
        yourNumber = readln()!!.toInt()
        when{
            yourNumber==0-> println(" so 0")
            yourNumber>0-> println(" so Dương")
            yourNumber<0-> println(" so Âm")
        }

        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}