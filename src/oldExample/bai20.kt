fun main(args: Array<String>) {
    while(true){
        do{
            println("nhap vao so nguyen a: ")
            var a=readLine()!!.toInt()
            var dem=0
            for(i in 1..a) {
                if (a % i == 0) {
                    dem++
                }
            }
            if(dem==2)
                println("$a la so nguyen to")
            else
                println("$a ko la so nguyen to")

        }while(a<=0)
        println("ban co muon tiep tuc, bam n de thoat: ")
        var n=readLine()!!.toString()
        if(n=="n"||n=="N")
            println("nghi di ")
            break
    }


}