import kotlin.random.Random

fun main(args: Array<String>) {
    // khoi tao random
    var rd = Random
    // random so nguyên
    var rdNguyen = rd.nextInt(until=1)// chay tu 0 sát 1
    println(rdNguyen)

    //random đoạn [a,)
    var rd2 = rd.nextInt(-100,50)
    println(rd2)

    // random so thực
    var rd3 = rd.nextDouble()// [0.1)
    println(rd3)

    // random so thuc > 1
    //cách 1
    var rd4 = rd.nextInt(-50,50)
    var rd5 = rd.nextDouble()
    var rd6 = rd4 + rd5
    println(rd6)


    // cách 2
    var rd7 = rd.nextDouble()*10
    println(rd7)
}