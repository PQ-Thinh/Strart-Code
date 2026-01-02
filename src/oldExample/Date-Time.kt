import java.text.SimpleDateFormat
import java.util.Calendar

fun main(args: Array<String>) {
    var cal = Calendar.getInstance()
    println(cal)
    // get ngayf thang nam
    var nam = cal.get(Calendar.YEAR)
    var thang = cal.get(Calendar.MONTH) + 1
    var ngay = cal.get(Calendar.DAY_OF_MONTH)
    println("Ngay thag nam= $ngay / $thang / $nam")


        // dat ngay thang nam
    cal.set(Calendar.YEAR, 1999)
    cal.set(Calendar.MONTH, 6)
    cal.set(Calendar.DAY_OF_MONTH, 20)

    // ktra sau thiet lap
    var namde = cal.get(Calendar.YEAR)
    var thangde = cal.get(Calendar.MONTH) + 1
    var ngayde = cal.get(Calendar.DAY_OF_MONTH)
    println("Ngay thag namde= $namde / $thangde / $ngayde")

    var date = cal.time
    //khai bao dinh dang
    var dinhdang = SimpleDateFormat("dd/MM/yyyy")
    println(dinhdang.format(date))
    // dinh dang loai 2
    var dinhdang2 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
    println(dinhdang2.format(date))
}