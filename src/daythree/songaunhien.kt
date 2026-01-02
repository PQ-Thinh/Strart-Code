package daythree

import kotlin.random.Random

fun main(){
    var start:Int
    var end:Int

    while (true){
        print("nhập vào start = ")
        start = readln()!!.toInt()
        print("nhập vào end = ")
        end = readln()!!.toInt()

            val rd = Random.nextInt(start, end + 1) // Tạo số ngẫu nhiên trong khoảng [start, end]
            println(rd)

        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}