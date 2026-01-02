
fun main(args: Array<String>) {
    println("nhap vao so nguyen a: ")
    var a=readLine()!!.toInt()
    println("nhap vao so nguyen b: ")
    var b=readLine()!!.toInt()
    println("nhap vao so nguyen pt: ")
    var PhepThinh = readLine()!!.toString()
    when(PhepThinh){
        "-"-> println("a-b= ${a-b}")
        "+"-> println("a-b= ${a+b}")
        "*"-> println("a* b= ${a*b}")
        "/"->
            if(b==0)
                println("dell dc dau")
            else
                println("a/b= ${a/b}")

    }
}