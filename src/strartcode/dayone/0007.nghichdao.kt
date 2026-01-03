package strartcode.dayone
import java.text.DecimalFormat

fun main(){
    print("Input a: ")
    val a:Int = readln().toInt()
    val df = DecimalFormat("#.#####")
    //var B:Float = 1/a.toFloat()
    print("B = "+ "1/"+a+" = "+ (df.format(1/a.toFloat())))

}