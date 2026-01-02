package daytwo

fun main(){
    var n:Int

    while (true){
        print("n = ")
        n = readln()!!.toInt()
        val a=n/10
        val b=n%10
        println("First: "+a)
        println("Last: "+b)
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}