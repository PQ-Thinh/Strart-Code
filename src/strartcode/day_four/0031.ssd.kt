package strartcode.day_four

fun main(){
    print("Input a: ")
    val a = readln().toFloat()
    print("Input b: ")
    val b = readln().toFloat()
    if(a>b) {
        print("a vo dich b ga")
    }else if(b>a){
        print("b vo dich a ga")
    }
    else
        print("2 con ga nhu nhau")
}