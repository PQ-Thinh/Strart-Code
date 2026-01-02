package daySeven


fun countMap(tasks:List<String>): Map<String, Int> {
    return tasks.filter { it.isNotBlank() }.groupBy { it.split(" ")[0]}.mapValues { it.value.size}

}

fun main(){
    val tasks = listOf("Do homework", "Buy milk", "Do exercise", "Buy bread"," ")
// output: {Do=2, Buy=2}
    println(countMap(tasks))

}