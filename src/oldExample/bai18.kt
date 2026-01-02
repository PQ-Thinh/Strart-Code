fun main(args: Array<String>) {
    var tong = 0
    println("nhap so nguyên n")
    var n = readLine()!!.toInt()
//
//        for (i in 10..n) {
//            if (i % 3 == 0) {
//                tong += i
//            }
//        }
//    println(tong)
    var gt=1
        for (i in 1..n) {
            gt*=i
            tong+=gt
        }
    println(tong)
}