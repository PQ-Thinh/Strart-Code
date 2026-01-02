fun main(args: Array<String>) {
    var nam:Int
    var s:String?= readLine()
    println("Moi nhap nam:")
    nam=s!!.toInt()
    if((nam%4==0&&nam%100!=0)||(nam%400==0)){
        print("nam: $nam la nam nhuan")
    }
    else print("nam: $nam la nam ko nhuan")
}