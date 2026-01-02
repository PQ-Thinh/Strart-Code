package dayone
fun main(){
    var with:Int
    var lenght:Int
    while (true){
        print("nhập vào with = ")
        with = readln()!!.toInt()
        print("nhập vào length = ")
        lenght = readln()!!.toInt()
        println("Perimeter: "+(with+lenght)*2)
        println("Area: "+(with*lenght))
        if (with==0&&lenght==0){
            break
        }
    }
}
