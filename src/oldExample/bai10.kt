import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Nhap he so  a: ")
    var a:Double? = readLine()?.toDouble()
    println("Nhap he so  b: ")
    var b:Double? = readLine()?.toDouble()
    println("Nhap he so  c: ")
    var c:Double? = readLine()?.toDouble()
    if (a!=null && b!==null && c!=null) {
        if(a==0.0){
            if(b==0.0&&c==0.0)
                print("PTVSN")
            else if(b==0.0&&c!=0.0)
                print("PTVN")
            else
                print("ngiem cua pt la: "+ (-c/b))

        }else {
            var delta = (b * b) - (4 * a * c)
            if(delta<0) {
                println("ptVn")
            }
            else if(delta==0.0) {
                println("pt co ng kep: " + (-b / (2 * a)))
            }
            else {
                println("pt co 2 ngiem pb: ")
                println("x1 = " + (-b + sqrt(delta)) / (2 * a))
                println("x2 = " + (-b - sqrt(delta)) / (2 * a))
            }
        }
    }
}