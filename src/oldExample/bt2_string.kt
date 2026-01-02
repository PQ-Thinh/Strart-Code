fun main(args: Array<String>) {
//Mess()
//    ThietlapMk()
   demtu()
 tachchuoi()
//    tinhtongvaTBC()
}
fun ThietlapMk(){
    var s1:String
    while(true) {
        var demso = 0
        var demchu = 0
        println("Moi nhap mk:")
        s1 = readLine()!!.toString()
        //if (s1 != null){
            if (s1.length <= 5)
                println("del du 6 ky tu")
            else {

                for (i in s1) {
                    if (i.isLetter())
                        demchu++
                    else if (i.isDigit())
                        demso++
                }
                if (demso * demchu == 0) {
                    println("thiết lập mat khau \" $s1\" cua ban khong hơp le!")

                } else {
                    println("Mật khẩu đã thết lập xong !")
                    break
                }
            }
        //}
    }
    var count = 1
    while (true) {
        println("Moi nhap vao mk đăng nhập $count/5")
        var login: String = readLine()!!.toString()
        if (count == 5) {
            println("vươt quá sô lần nhập sai hôm nay")
            break
        } else if (login == s1) {
            println("Đăng nhạp thành công")
            break
        } else
            count++
    }
}
fun demtu(){
    var cout=0
    var a ="toi cham hoc toi chiu kho toi dep zai toi hoc ngu toi ..."
    var b= "toi"
   // var check: Boolean = a.contains(b)
    var arr: List<String> = a.split(" ")
    for (i in arr) {
        if (i.contains(b)) {//i==b
            cout++
        }
    }
    println("so tu $b trong \" $a\" la $cout")
}
fun tachchuoi(){
    var s3 = "abc123"
    var s4=""
    var s5=""
    var arr= s3.toCharArray()
    for(i in arr){
        if(i.isDigit())
            s4+=i
        else if(i.isLetter())
            s5+=i
    }
    println(s4::class.java.typeName)
    println(s5)
}
fun tinhtongvaTBC(){
    var tong= 0
    var dem=0
    var s01: String= "English = 78 Science = 83 Math = 68 Hstory = 65"
    var arr = s01.split(" ")
    for(i in arr){
        if(i[0].isDigit()){
            tong+=i.toInt()
            dem ++
        }
    }
    println("tổng = $tong")
    println("TBC = $tong/$dem="+ (tong/dem))
}
fun Mess(){
    var a="abcdefghijklmnopqrstuvwxyz"
    var b="zxcvbnmasdfghjklqwertyuiop"
    var mahoa=""
    println("moi nhap chuoi")
    var s=readLine()!!.toString()
    for(i in s){
       //println(i)
       // println(a.indexOf(i))
        b[a.indexOf(i)]
        mahoa+=b[a.indexOf(i)]
    }
    println("chuỗi sau mã hóa: $mahoa")
}

