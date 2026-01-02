fun main(args: Array<String>) {
    // so hoan hao tu 1 den 1000
//    println("Moi nhap vao 1 so nguyen: ")
//    var n = readLine()!!.toInt()

    //var dem=0


    for (n in 1..1000) {
        var tong=0
        for (i in 1 until n) {
            if(n%i==0){
             //   println(i)
                tong+=i

            }
          //  println("tong: $tong")
        }
        if(tong==n)
            print("$n  ")
    }

}