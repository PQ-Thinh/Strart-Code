package strartcode.dayone

fun main(){
    print("Input a: ")
    val a:Int = readln().toInt()
    print("Input b: ")
    val b:Int = readln().toInt()
    val P:Float = (a/b).toFloat()
    val Q: Float = (a%b).toFloat()
    print(""+P+" "+Q)

}