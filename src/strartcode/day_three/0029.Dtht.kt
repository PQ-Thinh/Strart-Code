package strartcode.day_three

const val Pi = Math.PI
fun main(){
    print("Input cv: ")
    val cv = readln().toFloat()
    val R = cv/(2* Pi)
    print("s: ${String.format("%.2f",(Pi*R*R))}")
}