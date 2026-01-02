fun TinhTong(a:Int, b: Int):Int {
    return a+b
}
fun XInchao(){
    println("Xinchao")
}
fun check(a:Int):Boolean{
        if(a<=1)
            return false
        var dem=0
        for(i in 1..a) {
            if (a % i == 0) {
                dem++
            }
        }
        if(dem==2)
            return true
        else
          return false



}

fun main(args: Array<String>) {

    println("Tinh Tong: ${TinhTong(3,4)}")
    XInchao()

        println("nhap vao so nguyen a: ")
        var a=readLine()!!.toInt()
        if(check(a)==true)
            println("$a la so nguyen to")
        else
            println("$a ko la so nguyen to")




}