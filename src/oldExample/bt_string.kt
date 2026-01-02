fun main(args: Array<String>) {
//    var s1 = "       Lú quá chớ         ngu ác       "
//    var s2= s1.trim()
//    println(s2)
//    println(s1.length)
//    println(s2.length)
//
//    // xóa đuôi
//    var s3 = s1.trimEnd()
//    println(s3)
//    println(s1.length)
//    println(s3.length)
//
//    // xóa đầu
//    var s4 = s1.trimStart()
//    println(s4)
//    println(s1.length)
//    println(s4.length)

//    var s5 = "abc13579"
//    var s6 = "abc13579"
//    var x= s5.compareTo(s6)
//    println(x)
//
//    var s7 = " Hôm nay"
//    var s8 = " Buồn ngủ vl"
//    var s9 = s7.plus(s8)
//    var s10 = s9 + " nên em nghỉ ngủ luôn"
//    println(s10)


    // khai báo
//    var s11 = StringBuilder()
//    //khởi tạo
//    var s12 = StringBuilder("ngu quá ta")
//// insert chèn thêm vào chuỗi
//     s12.insert(3," vui")
//    println(s12)
//
//    // appen nối đuoi
//    s12.append(" nghỉ học thôi")
//    println(s12)
//
//    // delete xóa chuổi
//    s12.delete(4,8)
//    println(s12)
//    // đảo chuỗi
//    s12.reverse()
//    println(s12)
//tach chuoi theo dau
//    var s13 = "đen/đỏ/xanh/vàng"
//    var arr: List<String> = s13.split('/')
//    for (i in arr)
//        println(i)
//
//    var s14 = " Em là con súc vật hủy diệt muôn loài. "
//    var s15 = s14.lowercase()
//    var s16 = s14.uppercase()
//    println(s15)
//    println(s16)
//
//    // tách chuỗi thành ky tự
//    var mk = "abc13579"
//    //var ar2 = mk.toCharArray()
//    for (i in mk){//(i in ar2)
//        println(i)
//        println(i::class.java.typeName)
//    }
   // println("Mời nhập vao mật khẩu")
   // Ktramk()

}
//fun Ktramk(){
//    var mk = readLine()!!.toString()
//
//    var countSo = 0
//    var countChu = 0
//    var spaces =0
//    var demthg =0
//    var demhoa =0
//    var ar2 = mk.toCharArray()
//        for (i in ar2) {
//            if(i.isDigit())
//                countSo++
//
//            else if(i.isWhitespace())
//                spaces++
//            else if(i.isUpperCase())
//                demhoa++
//            else if(i.isLowerCase())
//                demthg++
//
//
//        }
//    println(countSo)
//    println(spaces)
//    println(demthg)
//    println(demhoa)
//}