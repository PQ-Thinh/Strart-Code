package strartcode.day_four

fun main(){
    print("Input years: ")
    val years = readln().toInt()

    when{
        years>0&&years<=11-> println(
"Thieu nhi")
        years>11 && years<=25 -> println(
"Thieu nien")
        years>25 && years<=50 -> println(
"Trung nien")
        years>50 -> println(
"Lao nien")
    }

}