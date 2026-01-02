fun main(args: Array<String>) {
    var a1:Boolean = "true".toBoolean()
    println(a1)
    println(a1::class.java.typeName)
    var a2:Byte = "2".toByte()
    var a3:Short = "20".toShort()
    var a4:Int = "20".toInt()
    var a6:Float="20.5".toFloat()
    println(a6)
    println(a6::class.java.typeName)
}