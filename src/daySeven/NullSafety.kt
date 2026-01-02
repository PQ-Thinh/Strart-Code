package daySeven

fun cleanInput(text:String?):String?{
    return text?.trim()?.takeIf { it.isNotBlank() }
}

fun main(){
    println(cleanInput("  Hello  World  ")) // output: "Hello World"
    println(cleanInput("   ")) // output: null
    println(cleanInput(null)) // output: null
}