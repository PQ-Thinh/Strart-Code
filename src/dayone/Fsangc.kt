package dayone

fun main(){
    var fahrenheit:Float
    var a:Char
    while (true){
        print("fahrenheit = ")
        fahrenheit= readln()!!.toFloat()
        println("Celsius: "+String.format("%.2f",(fahrenheit-32)/1.8))
        println("press y is stop")
        a= readln()!!.first()
        if (a=='y') break
        if (a!='y') continue

    }
}