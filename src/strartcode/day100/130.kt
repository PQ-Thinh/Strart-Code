package strartcode.day100


fun main(){
    print("n: ")
    val n = readLine()!!.toInt()
    var array = IntArray(n)
    for(i in 0 until n){
        print("array[$i]= ")
        array[i] = readln().toInt()
    }

    println(array.contentToString())
    var count = 0
    for(a in array){
        if(a%5 == 0) count++
    }
    println(count)
}