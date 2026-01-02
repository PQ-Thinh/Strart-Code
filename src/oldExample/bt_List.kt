import kotlin.random.Random

fun main() {

    //bai1()
    bai2()

}
fun bai1(){
    println("Nhập so luong phan tu: ")
    val n:Int= readln().toInt()
    val ds:MutableList<Int> =MutableList<Int>(n){0}
    val rd = Random // số ngẫu nhiên ừ 1 đến 100
    // nhap so ngau nhiên
    for(i in ds.indices){
        // ds[i] = readln()!!.toInt()
        ds[i] = rd.nextInt(1,100)
       // ds.add(rd.nextInt(1,100))
    }
    println("ds vua nhap là:"+ds)
//    for(i in ds.indices) {
//        print("\t ${ds[i]}")
//    }
}
fun bai2(){
    println("Nhập so luong phan tu: ")
    val n:Int= readln()!!.toInt()

    val ds:MutableList<Int> = MutableList<Int>(n){0}// mutableList()

    // nhap dl
    println("nhap pt in ds: ")
    for(i in ds.indices){
        ds[i] = readln().toInt()
    }
        // cách nhập dl 2
//    for(i in 1..n){
    // println("moi nhap vao phan tu thu $i ")
//        var input:Int? = readLine()?.toInt()
//        if(input == null) return
//        ds.add(input)
 //   println(ds)
//    }

    println("ds vua nhap là:"+ds)
//    for(i in ds.indices){
//        print("\t ${ds[i]}")
//    }


//    println("danh sach sau khi thay doi: ")
//    val ds1=ds.toMutableList()// tạo 1 bản sao của danh sách
//    for (i in ds.indices){
//       val a=(ds[i]*ds[i])
//        ds1.add(a)
//    }
//    for (i in ds1.indices){
//        print("\t ${ds1[i]}")
//    }
    // Tạo danh sách ds1 chứa các phần tử bình phương
    val ds1 = ds.map {x->x*x }.toMutableList()
    println("Danh sách sau khi thay đổi (bình phương các phần tử): ")
    for (i in ds1.indices) {
        print("\t ${ds1[i]}")
    }
    var dem=0
    for(i in ds1.indices) {
        if(ds1[i]>50)
            dem++
    }
    println("\n sl pt lon hon 50 la: $dem")
    // cách 2
//    var ds1:MutableList<Int> = mutableListOf()
//    for(i in ds){
//        ds1.add(i*i)
//
//    }
//    println(ds1)
}
