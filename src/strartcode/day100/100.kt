package strartcode.day100



fun main(){
    val b: Int =2000000
    var a: Int =1000000
    var month = 0

    while(a<b){
        a += a*2/100
                month++
    }

    println(month)
}