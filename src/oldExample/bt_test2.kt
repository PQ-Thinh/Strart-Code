import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
//    val f: Int =100
//    val c:Float =(f-32)*(5/9f)
//    val roundedC = String.format("%.1f", c)
//    println(roundedC)
//    val a=2
//    val b=3
//    val c= a.toDouble().pow(b.toDouble()).toInt()
//    println("$a^$b="+c)
//    var d=1
//    for (i in 1..3)
//        d*=a
//    println("$a^$b="+d)
//    var n:String="3"
//    var a= n
//    var b:String=n+n
//    var c:String=n+n+n
//    var d=a.toInt()+b.toInt()+c.toInt()
//    print("$a + $b + $c ="+d)
//    println("Nhập:")
//    val a=readLine()!!.toInt()
//    val b=a/100
//    if( b > 0){
//        println(b)
//    }
//    else
//        println(0)
//    val rd = Random
//    val a=rd.nextInt(14,19)
//    println(a)
//    val num=8
//    var gt:Int=1
//    for(i in 1..num){
//        gt*=i
//    }
//    println(gt)
    // ax+b=0

    while(true) {
        // ax^2+bx+c=0
        var count = 0
        print("Nhap a: ")
        val a = readLine()!!.toFloat()
        print("Nhap b: ")
        val b = readLine()!!.toFloat()
        print("Nhap c: ")
        val c = readLine()!!.toFloat()
        if (a == 0f) {
            PTB1(b, c)
            count++
        } else {
            val delta: Float = b.pow(2) - 4 * a * c
            val x1: Float = (-b - sqrt(delta)) / (2 * a)
            val x2: Float = (-b + sqrt(delta)) / (2 * a)
            if (delta == 0f) {
                println("pt co nghiem duy nhat: " + (-b) / (2 * a))
                count++
            } else if (delta > 0f) {
                println("Pt có 2 nghiem phân biệt:")
                println("Nghiem thu nhat x1= " + x1)
                println("Nghiem thu hai x2= " + x2)
                count++
            } else {

                println("vô phương cứu chữa??")
                count++

            }
        }
        if (count == 5) {
            break
        }
    }
}
// ax + b=0
fun PTB1(a:Float, b:Float){
    if(a==0f)
        if(b==0f)
            println("Pt vô só nghiệm ")
        else
            println("Pt có vô nghiệm")
    else
        println("Pt co nghiem là :"+(-b/a))
}



