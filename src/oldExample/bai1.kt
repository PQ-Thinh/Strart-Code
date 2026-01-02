fun main(args: Array<String>) {
    // ép kiểu rộng
    var soA:Int = 35
    var soB:Long = soA.toLong()
    println(soA::class.java.typeName)
    println(soB::class.java.typeName)

// ép kiểu hẹp
    var x:Short = 32767
    var y:Byte = x.toByte()
    println("x= $x")
    println("y= $y")


    var m:Short = 120
    var n:Byte = m.toByte()
    println("m= $m")
    println("n= $n")

    //vd 3
    var diemtoan:Float = 9.5f
    var diemvar:Int = diemtoan.toInt()
    println("diem van= $diemvar")
}