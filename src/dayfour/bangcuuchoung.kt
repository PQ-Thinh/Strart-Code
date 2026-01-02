package dayfour

fun main(){
    var number:Int

    while (true){
        print("number = ")
        number = readln()!!.toInt()
        for (i in 1..10){
            println(String.format("%d x %d = %d",i,number,(i*number)))
        }
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}