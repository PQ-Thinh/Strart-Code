package dayfour

fun main(){
    var totalLine:Int
    var time:Int
    while (true){
        print("totalLine = ")
        totalLine = readln()!!.toInt()
        print("timeDoing = ")
        time = readln()!!.toInt()
        val salary=20*time
        when{
            totalLine<10-> println("Slary: "+(salary-1)+"$")
            totalLine in 10..20-> println("Slary: "+(salary-2)+"$")
            totalLine>20-> println("Slary: "+(salary-5)+"$")
        }
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}