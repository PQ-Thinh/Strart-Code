package strartcode.day_three

const val PI = Math.PI
fun main(){
   print("Input r: ")
    val r = readln().toInt()
    print("chu vi: "+String.format("%.2f",(r*2* PI))+"\n" +"dien tich: "+(r*r* PI))
}