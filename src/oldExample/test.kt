import kotlin.random.Random

fun play(){
    var rd = Random
    var r1 = rd.nextInt(1,99)
    var dem=1
    while(true) {
        println(r1)
        println("Nhap vao dáp án")
        var n = readLine()!!.toInt()
        if (n == r1){
            println("You won, số của bạn $n = số máy = $r1")
            break
        }
        else
            println("You lost")


        if(dem==7){
            println("ban qua ga")
            break
        }
        else
            dem ++


    }
}

fun main(args: Array<String>) {
    while(true){
        play()
        println(" ban co muon thoat chuong trinh (nhấn Y để thoát)")
        var button = readLine()!!
        if (button == "Y" || button == "y") {
            break
        }
    }

}