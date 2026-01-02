import kotlin.math.sqrt

fun giaiPTB2(a: Double, b: Double, c: Double): String {
    if(a==0.0){
        if(b==0.0&&c==0.0){
            return "PT co vsn"
        }else if(b==0.0&&c!=0.0){
            return "PT vo nghiem"
        }else
            return "PT co nghiem x= ${-c/b}"
    }else
    {
        var delta= b*b-4*a*c
        if(delta<0.0){
            return "PT vo nghiem"

        }else if(delta==0.0){
            var x=-b/(2*a)
            return "PT co nghiem kep x1=x2= $x"
        }else {
            var y = (-b - sqrt(delta)) / (2 * a)
            var y2 = (-b + sqrt(delta) )/ (2 * a)
            return "PT co 2 nghiem PB, y=$y,\n y2=$y2"
        }
    }
}

fun main(args: Array<String>) {

   val kq1=giaiPTB2(1.0, 2.0,- 3.0)
     println(kq1)
}