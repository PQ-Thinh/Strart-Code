package daythree

fun main(){
    var X:Int
    var Y:Int
    var Z:Int
    while (true){
        print("X = ")
        X= readln()!!.toInt()
        print("Y = ")
        Y= readln()!!.toInt()
        print("Z = ")
        Z= readln()!!.toInt()
        when{
            (X+Y)>Z&&(X+Z)>Y&& (Z+Y)>X-> println("True")
            else-> println("False")
        }
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}