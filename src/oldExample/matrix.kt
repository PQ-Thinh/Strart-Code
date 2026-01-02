import kotlin.random.Random

fun main(args: Array<String>) {

    println("Nhap so luong hang: ")
    var n=readLine()!!.toInt()
    println("Nhap so luong cot: ")
    var m=readLine()!!.toInt()

    var M= Array(n) {IntArray(m)}
    mang2c(M,m,n)
}

fun mang2c(M:Array<IntArray>,m:Int, n: Int,) {
    //var rd=Random
    // var n=readLine()!!.toInt()

    for (i in 0 until  n){
        for (j in 0 until  m){
            //print("M[$i][$j]=")
            M[i][j] = readLine()!!.toInt() // rd.nextInt
        }

    }

    println("chuoi so vua nhap la : ")
    for(i in M.indices){// (0 until M[i].size)
        for(j in M[i].indices){
           print("\t ${M[i][j]}")

        }
        println()
    }
}
