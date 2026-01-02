package daythree

fun main(){
    var yourNumber:Int
    while (true){
        print("yourNumber = ")
        yourNumber= readln()!!.toInt()

        var a:String
        if(yourNumber<100)
            println(0)
        else {
            var h = (yourNumber / 100)%10
//            a = h.toString()
//            println(a.last())
            println(h)
        }
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}