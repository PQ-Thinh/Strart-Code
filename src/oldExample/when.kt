//fun main(args: Array<String>) {
//    println("Nhap vao i")
//    var i:Int = readLine()!!.toInt()
//    when(i){
//        1 -> println("Thim bam so 1")
//        2 -> println("Thim bam so 2")
//        3 -> println("Thim bam so 3")
//        else -> println("sai so")
//    }
//}
//fun main(args: Array<String>) {
//    println("moi nhap vao 1 so nguyen")
//    val i:Int = readLine()!!.toInt()
//    // ktra cấu trúc ưhen
//    when (i%2) {
//        0 -> println("$i là so chẵn")
//        else -> println("$i là số lẻ ")
//    }
//}
//fun main(args: Array<String>) {
//    println("moi nhap vao thang")
//    var thang:Int = readLine()!!.toInt()
//    when (thang) {
//        1,2,3 ->  println("Tháng $thang thuộc quý 1")
//        4,5,6 ->  println("Tháng $thang thuộc quý 2")
//        7,8,9 ->  println("Tháng $thang thuộc quý 3")
//        10, 11,12 ->  println("Tháng $thang thuộc quý 3")
//        else -> println("ngu ác")
//    }
//}

//fun main(args: Array<String>) {
//    println("Mời nhập vào thu nhập: ")
//    var thuNhap:Int = readLine()!!.toInt()
//    when (thuNhap) {
//        in 1..3-> println("nghèo kiếp xác")
//        in 4..7->println("nghèo vừa vừa")
//        in 8..19->println("thu nhập khá")
//        in 20..50-> println("thu nhạp cao")
//        in 51..1000->println("thu nhập rất cáo")
//        else->println("xam lol")
//    }
//}
//fun main(args: Array<String>) {
//    var check:Boolean
//    do {
//        println("nhap a")
//        var a: Int = readLine()!!.toInt()
//
//        check = when (a) {
//            in 0..100 -> true
//            else -> false
//        }
//    }while (a<=10 || a>=100)
//    println("mơi nhạp lại!! ")
//    println(check)
//}
fun main(args: Array<String>) {
    var a= 0.1+0.2
    var b= 0.3
    when{
        a==b-> println("a is b")
        a!=b-> println("a is not b")
    }
}