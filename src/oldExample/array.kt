fun main(args: Array<String>) {
//    print("Nhap so luong phan tu: ")
//    var n=readLine()!!.toInt()
//
//     var M=mang(n)
//println("\n Minimum: ${M.first()}")// Minimum
//println("\n Minimum: ${M[0]}")// Minimum
//println("\n Maximum: ${M[M.size-1]}")// Mãximum
//println("\n Maximum: ${M.last()}")// Mãximum

    //Trích lọc mảng theo điều kiện=> trả về ArrayList
    var M4= arrayOf(1,2,3,4,5)
    var ds= M4.filter { x->x!=null }
    println(ds::class.java.typeName)
    println(ds)
    var ds2=M4.filter { t->t%2==0 } // lọc đk chia hết cho 2
    println(ds2)

    // clone mang ổi vùng nhớ
//    var M1 = arrayOf(1,2,4,5,6)
//    var M2 = M1.clone()
//    M1[0]=9
//    println(M1[0])
//    println(M2[0])
}
fun mang(n: Int):IntArray {
    var M=IntArray(n)
    for(i in M.indices) {
        print(" M[$i]= ")
        M[i]=readLine()!!.toInt()
    }
    println("Mang phan tu: ")
   // M.reverse() //đảo ngược mảng
    M.sort(); //sắp xep tăng dân
    for(i in 0 until n) {
        print("\t ${M[i]}")
    }
    return M
}