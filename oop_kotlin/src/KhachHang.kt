class KhachHang {
    var maKH:Int = 0
    var tenKH:String = ""
    var slhang:Int = 0
    var DG:Int = 0
    constructor(maKH:Int, tenKH:String ) {
        this.maKH = maKH
        this.tenKH = tenKH
        this.slhang = slhang
        this.DG=DG
    }
    fun Nhap() {
        println("Nhâp ma: ")
        maKH = readln()!!.toInt()
        println("Nhâp ten: ")
        tenKH = readln()!!
        println("Nhâp sl: ")
        slhang = readln()!!.toInt()
        println("Nhâp DG: ")
        DG= readln()!!.toInt()
    }
    fun TinhTongtien(slhang: Int,DG: Int):Int{
        return slhang*DG
    }

}