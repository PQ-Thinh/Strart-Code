import kotlin.math.pow

fun main(args: Array<String>) {
    var chieucao:Float
    var cannang:Float
    println("Nhap vao chieu cao cua ban: ")
    var s:String?= readLine()
        chieucao=s!!.toFloat()
    println("Nhap vao can nang cua ban: ")
    var x:String?= readLine()
        cannang=x!!.toFloat()
    var BMI:Float = cannang/((chieucao).pow(2))
    if(BMI<15){
        println("Gay qua")
    }else if((BMI>=15).and(BMI<16)){
        println("kha gay")
    }else if((BMI>=18.5).and(BMI<25)){
        println("normal body")
    }else if(BMI>=25 ){}

}