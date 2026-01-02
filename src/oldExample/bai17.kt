fun main(args: Array<String>) {
    var gt =1
    println("nhap so nguyên n")
    var n=readLine()!!.toInt()
//    for (i in 1..n){
//        gt*=i
//    }
//    println("$n=$gt")
    //ưhile
    var i=1
    while(i<=n){
        gt*=i
        i++
    }
    println("$n!=$gt")
}