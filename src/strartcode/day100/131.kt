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
    var sum = 0
    for(a in array){
        if(a%2 == 0)
            sum += a
    }
    println(sum/n)
}