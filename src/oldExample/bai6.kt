import kotlin.math.PI
import kotlin.math.pow

fun main(args: Array<String>) {
//    // nhap chuoi tu ban phim
//    println("Nhap ten")
//    var ten:String? = readLine()
//    println("ten vua nhap la : $ten")
//    var A:Int
//    println(" nhap vao 1 so nguyen :")
//    var s:String? = readLine()
//    if (s!=null) {
//        A = s.toInt()
//        println("So nguyen vua nhap:" + A)
//        println(A::class.java.typeName)
//    }
    // bai tap
//    var r:Double= 0.0
//    println("NHap ban kinh: ")
//    var s:String?= readLine()
//    if(s!=null)
//        r= s.toDouble()//ep kieu
//        println("chu vi cua hinh tron: "+2* PI*r)
//        print("Dien tinh hinh ton: "+PI*r.pow(2))
    // bai tap 2
    var a:Float=0f
    var b:Float=0f
    println("Nhap chieu dai: ")
    var s:String?= readLine()
    println("NHap chieu rong: ")
    var x:String?= readLine()
    //if((s!=null)&&(x!=null)) {
        a = s!!.toFloat()// !! thay cho ktra null
        b = x!!.toFloat()
        println("chu vi:" + (a + b) * 2)
        println("dien tich: " + (a * b))
    //}
}