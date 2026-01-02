package daytwo

fun main(){
    var one:Int
    var two:Int
    var three:Int
    //val a:MutableList<Int>
    while (true){
        print("one   =")
        one = readln()!!.toInt()
        print("two   =")
        two = readln()!!.toInt()
        print("three =")
        three = readln()!!.toInt()
       val max = maxOf(one,two,three)
        val DTB:Float =(one.toFloat()+two.toFloat()+three.toFloat())/3
        println(String.format("Avg: %.2f",DTB))
        println("Max: "+max)
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break



    }
}