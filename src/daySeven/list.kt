package daySeven

fun filterLongTasks(tasks: List<String>): List<String> {
    return tasks.filter { it.length > 5 }
}
fun filterAndSortTasks(tasks: List<String>):List<String>{
    return tasks.filter { it.startsWith("Do")}.sorted()
}
fun filterLongNotMilkTask(tasks: List<String>):List<String>{
    return tasks.filter { it.length > 5 && !it.contains("milk") }
}
// test
fun main() {
    val tasksOne = listOf("Mua sữa", "Đi siêu thị", "Học Kotlin", "Code")
    val taskTwo= listOf("Do homework", "Buy milk", "Do exercise", "Sleep")
    //println(filterLongTasks(tasksOne)) // output: ["Đi siêu thị", "Học Kotlin"]
    //println(filterAndSortTasks(taskTwo))// output: ["Do exercise", "Do homework"]
    println(filterLongNotMilkTask(taskTwo))
}