package daySeven

fun removeDuplicatesSet(tasks:List<String>):Set<String>{
    return tasks.distinctBy {  it.lowercase() }.toSet()
}

fun main(){
    val tasks = listOf("Do homework", "do homework", "Buy milk", "Buy milk")
// output: [Do homework, Buy milk]
    println(removeDuplicatesSet(tasks))
}