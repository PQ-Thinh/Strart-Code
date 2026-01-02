
fun main() {
//    println("Use the val keyword when the value doesn't change.")
//    println("Use the var keyword when the value can change.")
//    println("When you define a function, you define the parameters that can be passed to it.")
//    println("When you call a function, you pass arguments for the parameters.")
//    println("New chat message from a friend")

//    var discountPercentage: Int = 0
//    var offer: String = ""
//    val item:String = "Google Chromecast"
//    discountPercentage = 20
//    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
//
//    println
//    val numberOfAdults = 20
//    val numberOfKids = 30
//    val total = numberOfAdults + numberOfKids
//    println("The total party size is: $total")
//    val baseSalary = 5000
//    val bonusAmount = 1000
//    val totalSalary:Int = baseSalary + bonusAmount
//    println("Congratulations  your bonus! You will receive a total of $totalSalary (additional bonus).")
//    val firstNumber = 10
//    val secondNumber = 5
//    val thirdNumber = 8
//    val result = blue(firstNumber, secondNumber)
//    val anotherResult = blue(firstNumber, thirdNumber)
//    println("$firstNumber + $secondNumber = $result")
//    println("$firstNumber + $thirdNumber = $anotherResult")

// Define add() function below this line

//    val operatingSystem="Mac OS"
//    val emailId =  "sample@gmail.com"
//    println(displayAlertMessage(operatingSystem, emailId))
//    val Steps = 4000
//    val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
//    println("Walking $Steps steps burns $caloriesBurned calories")
    // so sánh 2 số
//    val timeSpentToday = 300
//    val timeSpentYesterday = 300
//    println(check(timeSpentToday, timeSpentYesterday))
        println("Nhập tên tp:")
    when(val NameCity:String = readln()){
            "Ankara"-> println(" City: $NameCity \n Low temperature: 27, High temperature: 31\n Chance of rain: 82%")
            "Tokyo"-> println(" City: $NameCity \n Low temperature: 32, High temperature: 36\n Chance of rain: 10%")
            "Cape Town"-> println(" City: $NameCity \n Low temperature: 59, High temperature: 64\n Chance of rain: 2%")
            "Guatemala City"-> println(" City: $NameCity \n Low temperature: 50, High temperature: 55\n Chance of rain: 7%")
        }


}
fun blue(a: Int, b: Int): Int { return a + b}// dịnh nghĩa add
fun displayAlertMessage(a:String, b:String){
    when(a){
      "Unknown OS"->  println("There's a new sign-in request on Unknown for your Google Account $b.\n")
        "Windows "->  println("There's a new sign-in request on Window Os for your Google Account $b.\n")
        "Mac OS"->  println("There's a new sign-in request on Mac OS for your Google Account $b.\n")
        else-> println("erroll")
    }

}
fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    return TotalCALORIESburned
}
fun check(a: Int, b: Int): Boolean = a>b

