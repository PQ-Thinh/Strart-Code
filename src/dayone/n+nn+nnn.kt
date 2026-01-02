package dayone

fun main(){
    var n:Int
    while (true){
        print("n = ")
        n= readln()!!.toInt()
        var b=0
        for(i in 1..11){
            b+=n
        }
        var c=0
        for(j in 1..111)
            c+=n
        var d=n+b+c
        println(String.format("%d + %d + %d = %d",n,b,c,d))
    }
//    while (true) {
//        print("n = ")
//        val n = readln()
//        if (n.toIntOrNull() != null && n.toInt() < 10) {
//            val nn = n + n
//            val nnn = n + n + n
//            val total = n.toInt() + nn.toInt() + nnn.toInt()
//            println("$n + $nn + $nnn = $total")
//        } else {
//            println("Vui lòng nhập một chữ số (0-9).")
//        }
//    }
}