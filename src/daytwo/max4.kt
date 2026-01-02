package daytwo

fun main(){
    var one:Int
    var two:Int
    var three:Int
    var four:Int
    //var a:MutableList<Int> = mutableListOf()
    while (true){
        print("one   =")
        one = readln()!!.toInt()
        print("two   =")
        two = readln()!!.toInt()
        print("three =")
        three = readln()!!.toInt()
        print("four  =")
        four = readln()!!.toInt()
        val max =maxOf(one,two,three,four)

        println("Max "+one+","+two+","+three+","+four+":"+max)
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}