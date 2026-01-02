fun main(args: Array<String>) {
//    var a:Float=0.0f
//    var b:Float=0.0f
//    println("Nhap vao so a: ")
//    var s:String?= readLine()
//        a=s!!.toFloat()
//    println("Nhap vao so b: ")
//    var x:String?= readLine()
//        b=x!!.toFloat()
//    var max:Float
//    max = if (a>b) a else b
//    println("So lon nhat la: $max")
    // bai tap
    var tong:Float
    var hieu:Float
    println("Nhap vao tong 2 so :")
    var s:String?= readLine()
        tong=s!!.toFloat()
    println("Nhap vao hieu cua 2 so:")
    var x:String?= readLine()
        hieu=x!!.toFloat()
    var a:Float
    var b:Float
        a = (tong + hieu)/2
        b = (tong -a)
    println(a)
    println(b)
}

