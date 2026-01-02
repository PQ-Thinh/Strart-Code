import java.text.SimpleDateFormat
import java.util.Calendar

// nhap vao nam sinh in ra so tuoi hien tai


fun main(args: Array<String>) {
    var dinhdang = SimpleDateFormat("dd/MM/yyyy")
    println(" moi nhap vao ngay thang nam sinh : ")
    var s= readLine()!!
    /* ep kieu / thông tin nhập biến s phai theo
     dinh dang va lưu vao dateinput */
    var dateInput= dinhdang.parse(s)
    // khoi tao bien datetime
    var timeNamsinh= Calendar.getInstance()
    // set timenamsinh = thoi gian nhap vao
    timeNamsinh.time = dateInput
    var namsinh = timeNamsinh.get(Calendar.YEAR)
    var thangsinh = timeNamsinh.get(Calendar.MONTH) + 1
    var ngaysinh = timeNamsinh.get(Calendar.DAY_OF_MONTH)
    println("ngay thang nam sinh : $ngaysinh/$thangsinh/$namsinh")

    // tao binh datetime
    var timenow = Calendar.getInstance()
    // lay nam hien tai
    var namhientai= timenow.get(Calendar.YEAR)
    // tinh tuoi
    var tuoi = namhientai- namsinh
    println("tuoi cua ban : $tuoi")
}