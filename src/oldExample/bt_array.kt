fun main(args: Array<String>) {
    print("Nhap so luong phan tu: ")
    var n=readLine()!!.toInt()
    var M=IntArray(n)
//    val M = nhap(n)
    nhap(n,M)
    xuat(M)
    daomang(M)
    sapxeptangdan(M)
    tinhtong(M)
    timvitr(M)
}
fun nhap(n: Int,M: IntArray) {

    for(i in M.indices) {
        print(" M[$i]= ")
        M[i]=readLine()!!.toInt()
    }
}
fun xuat(M:IntArray) {

    println("Mang phan tu: ")
    for(i in M.indices) {
        print("\t ${M[i]}")
    }
    println()
}
fun daomang(M:IntArray) {
    M.reverse()
    println("Mang phan tu sau khi dao: ")
    for(i in M.indices) {
        print("\t ${M[i]}")
    }
    println()
}
fun sapxeptangdan(M:IntArray) {
    M.sort()
    println("Mang phan tu sau khi sap xep: ")
    for(i in M.indices) {
        print("\t ${M[i]}")
    }
    println()
}
fun tinhtong(M:IntArray) {
    var tong=0
    for(i in M.indices) {
        tong+=M[i]
    }
    println("tong:$tong")
}
fun timvitr(M:IntArray) {
    println("nhap so can tim: ")
   var vitri:Int=-1
    var m=readLine()!!.toInt()
    for(i in M.indices) {
        if(m==M[i]) {
           vitri=i
        }
    }
    if(vitri==-1)
        println("so $m ko tôn tại trong mảng!")
    else
        println("vi tri so can tim la: $vitri")
}
