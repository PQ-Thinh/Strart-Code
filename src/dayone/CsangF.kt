package dayone

fun main(){
    var Celsius:Float
    var a:Char
    while (true){
        print("Celsius = ")
        Celsius= readln()!!.toFloat()
        println("Fahrenheit: "+String.format("%.2f",(Celsius*1.8)+32))
        println("press y is stop")
        a= readln()!!.first()
        if (a=='y') break
        if (a!='y') continue

    }
}