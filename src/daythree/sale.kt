package daythree

fun main(){
    var totalsale:Float
    while (true){
        print("totalSale = ")
        totalsale = readln()!!.toFloat()
        when{
            totalsale<=100-> println(String.format("Hoa hồng: %.1f",(totalsale*5)/100))
            totalsale<=300-> println(String.format("Hoa hồng: %.1f",(totalsale*10)/100))
            totalsale>300-> println(String.format("Hoa hồng: %.1f",(totalsale*20)/100))
        }
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}