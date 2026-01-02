fun main(args: Array<String>) {
//    var i=0
//    while(i<10) {
//        println(i)
//        i++
//    }
//    println(" vong lap da xong, i = $i")

//   var n= 0
//    while(n<1 || n>99){
//        println("Nhap n: ")
//        var s: String?= readLine()
//        n=s!!.toInt()
//    }
//    println("Nhap hop le n: $n")
//
    // lap vinh cuu
//    while(true) {
//        print("Ban co muon thoat ko (bam 'y' de thoat) : ")
//        val name = readLine()
//        if (name == "y"||name == "Y") {
//           break
//        }
//    }
//    println("may day")
    do{
        println("nhap so n : ")
        var n:Int= readLine()!!.toInt()
        for (i in 1..n) {
            for (j in 1..i) {
                print("$i$j ")
            }
            println()
        }
    }while(n<1 || n>99 )

}