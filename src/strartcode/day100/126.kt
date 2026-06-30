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
    for(a in array){
        if(a%2!=0){
            print(" $a")
        }
    }

}