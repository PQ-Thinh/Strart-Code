class ThamChieuThis {
    // instance var
    var diemvan:Float = 0f
    var diemtoan:Float = 0f
    fun TestCucbo(diemvan:Float,diemtoan:Float) {
        println("Tổng điểm trong biến cục bộ: "+(diemvan+diemtoan))
        println("Tổng điểm trong biến cục bộ instance var: "+(this.diemvan+this.diemtoan))
        this.diemvan = diemvan
        this.diemtoan = diemtoan
    }
}