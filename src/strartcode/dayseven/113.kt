package strartcode.dayseven

fun main(){
    print("Inpurt N: ")
    val n = readln().toInt()
    val sum = divisor(n).sum()
    if (sum>n){
        print("Yes")
    }else{
        print("NO")
    }

}

fun divisor(k:Int):MutableList<Int>{
    val t = mutableListOf<Int>()
    for (i in 1 until k){
        if(k%i==0){
            t.add(i)
        }
    }
    return t
}


