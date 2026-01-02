import jdk.internal.org.jline.utils.Colors.s

fun main(args: Array<String>) {
//    var s:String = "bly sky"
//    var s1= "dsnfjsbdj"
//    println(s::class.java.typeName)
//    var s3= "co ng bi sida bo lANG nươc "
//    println(s3.length)
//    var so ="abcdceaf"
    //in vi tri
//    println(so.indexOf("a"))// chữ cái đàu tiên
//    println(so.lastIndexOf("a"))// chữ cái cuối cùng

    // kiểm tra có chuỗi con nằm trong chuổi mẹ ko
//    var s10=".mp3"
//    var s11="bluesky.mp3"
//    var check:Boolean= s11.contains(s10)
//    if(check){ // check == true
//        println("có $s10 nằm trong $s11 ")
//    }
//    else{
//        println(" ko có $s10 nằm trong $s11 ")
//    }
//
//    var s12="fffff0123456789"
//    // lấy từ index 2 đến hết
//    var s13 = s12.substring(2)
//    println(s13)
//// lấy từ index 2 đến gần 9
//    var s14 = s12.substring(2,9)
//    println(s14)

    var s15= "Học nữa học mãi"
    var s16 = s15.replace("học", "ngủ")
    println(s15)
    println(s16)
    var s17= s15.replace("học", "ngủ",ignoreCase = true)
    println(s17)
// thay chữ đầu tiên tìm thấy
    var s18= s15.replaceFirst("học", "ngủ",ignoreCase = true)
    println(s18)
}