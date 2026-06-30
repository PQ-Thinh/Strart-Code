package strartcode.day100

fun main(){
    val words = listOf("apple", "orange", "banana", "kiwi")
    val freq = mutableMapOf<String, Int>()
    for ((w) in words.withIndex()){}
    for (w in words){
        freq[w] = (freq[w] ?: 0) + 1
    }
    val freqMap = words.groupingBy { it }.eachCount()
    println(freqMap)
}