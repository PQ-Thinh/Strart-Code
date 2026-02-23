package strartcode.day_five

fun main() {
    val mysa = Person("Mysa", 23, "play football", null)
    val amanda = Person("Amanda", 33, "play tennis", mysa)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
    mysa.showProfile()

}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        val context:String
        if (referrer==null){
            context = "Likes to "+ hobby +"Doesn't have a referrer."
        }
        else{
            context = "Likes to "+ hobby + "Has a referrer named " + referrer.name+",who likes to "+referrer.hobby
        }
        println("Name: "+name+"\n"
        +"Age: "+age+"\n"
        +"Likes to "+hobby+". "
        + context +"\n"

        )
    }
}