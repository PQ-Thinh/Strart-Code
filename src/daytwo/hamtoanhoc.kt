package daytwo

fun main(){
    var one:Int
    var two:Int
    while (true){
        print("one   =")
        one = readln()!!.toInt()
        print("two   =")
        two = readln()!!.toInt()
        println(String.format("%d + %d = %d",one,two,one+two))
        println(String.format("%d - %d = %d",one,two,one-two))
        println(String.format("%d x %d = %d",one,two,one*two))
        println(String.format("%d : %d = %.2f",one,two,(one/two).toFloat()))
       println(""+one+" + "+two+" = "+(one%two))

        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}