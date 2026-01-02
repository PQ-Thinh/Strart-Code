package dayone

fun main(){
    var base:Int
    var exponent:Int
    var a:Char
    while (true){
        print("base = ")
        base= readln()!!.toInt()
        print("exponent = ")
        exponent= readln()!!.toInt()
        var total=1
        for (i in 1..exponent){
            total*=base
        }
        println(String.format("%d^%d = %d",base,exponent,total))
    }
}