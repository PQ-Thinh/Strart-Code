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
        var max=0
        if(one>two&&one>three){
            max=one
        }else if(two>three){
            max=two
        }else
            max=three

        println("Max "+one+","+two+","+three+":"+max)

    }
}