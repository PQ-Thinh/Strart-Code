package daytwo

fun main(){
    var student:Int
    var fruit:Int
    while (true){
        print("student =")
        student = readln()!!.toInt()
        print("fruit   =")
        fruit = readln()!!.toInt()
        val a=fruit/student
        val b=fruit%student
        println("Mỗi bạn nhận được "+ a +" quả và dư "+ b +" quả.")
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}