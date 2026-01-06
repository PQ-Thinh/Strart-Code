package strartcode.day_four

fun main(){
    print("Input a: ")
    val a = readln().toInt()
    print("Input b: ")
    val b = readln().toInt()
    if(a>b){
        print("An nhanh hon\n")

    }
    if(b>a){
        print("Binh nhanh hon\n")

    }
    if(a==b){
        print("Bang nhau")
    }


}