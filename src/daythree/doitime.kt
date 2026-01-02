package daythree

fun main(){
    var number:Int
    while (true){
        print("number = ")
        number= readln()!!.toInt()
        val h=number/3600
        val p=(number%3600)/60
        val s=((number%3600)%60)
        println("Thời gian của bạn là: "+h+":"+p+":"+s)
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}