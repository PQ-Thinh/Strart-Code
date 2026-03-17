import kotlin.math.sqrt

fun main(){
    print("Input N: ")
    val n = readln().toInt()

    if(Prime(n)) {
        println("No (n là số nguyên tố, không phải số Smith)")
        return
    }

    val sumDigitsN = digitSum(n)
    val factors = primeFactors(n)
    val sumDigitsFactors = factors.sumOf { digitSum(it) }

    if(sumDigitsN == sumDigitsFactors){
        println("Yes (n là số Smith)")
    } else {
        println("No")
    }
}

fun Prime(k:Int):Boolean{
    if(k < 2) return false
    for(i in 2..sqrt(k.toDouble()).toInt()){
        if(k % i == 0) return false
    }
    return true
}

fun digitSum(x: Int): Int {
    var num = x
    var sum = 0
    while(num > 0){
        sum += num % 10
        num /= 10
    }
    return sum
}

fun primeFactors(n: Int): List<Int> {
    var num = n
    val factors = mutableListOf<Int>()
    var i = 2
    while(i <= num){
        if(num % i == 0){
            factors.add(i)
            num /= i
        } else {
            i++
        }
    }
    return factors
}
