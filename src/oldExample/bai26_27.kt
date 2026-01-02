fun main() {
    //bai26()
    //bai27()
    bai28()
}
fun bai26() {
    // cách 1 List pair gộp 2 list
//    var quest:List<Pair<String, Int>> = listOf("2 + 5 +7 =" to 14,
//        "5*10 =" to 50,
//        "sqrt(16) =" to 4,
//        "12%2 =" to 0)// khai báo sữ dụng Pải để lưu trữ 2 dữ liệu
//    for(i in quest){
//        print(i.first)// dùng first đẻ truy xuất dữ liệu ô thứ nhâất
//        var n = readln()!!.toInt()
//        if (n==i.second )//dùng second đẻ truy xuất dữ liệu ô thứ hai
//                println("correct")
//        else  println("incorrect, the answer is ${i.second}")
//
//    }

    // cách 2 bài 26
    var quest:MutableList<String> = mutableListOf("2 + 5 +7 =" ,
        "5*10 =" ,
        "sqrt(16) =" ,
        "12%2 =" )
    var dapan:MutableList<Float> = mutableListOf(14f,50f,4f,0f)
    for (i in quest.indices) {
        print(quest[i])
        val n = readln()!!.toFloat()
        if(n==dapan[i]){
            println("correct")
        }
        else println("incorrect, the answer is ${dapan[i]}")



    }

}


fun bai27(){
    println("nhap vao sl pt của danh sách: ")
    var n = readln()!!.toInt()
    var ds:MutableList<Int> =MutableList(n){0}
    println("nhap pt: ")
    for(i in ds.indices){
        print("ds[$i] = ")
        ds[i] = readln()!!.toInt()
    }
    println("xuất ds các pt vừa nhập")
    for(i in ds.indices){
        print("\t ${ds[i]} ")
    }
    println("\n vi tri cac phan tử < 5")
   var dem=0
    for (i in ds.indices){
        if(ds[i]<5) {
            dem++
            print("\t $i")
        }
    }
    println("\n so luong pt < 5 là: $dem")
}
fun bai28(){

    var ds2:MutableList<Int> = mutableListOf(1,2,5,1,2,4,8,7,8,10,10)
    print(" danh sách: ds2= "+ds2)
    var ds3 = ds2.toMutableList()
    ds3.sort()

    val min = ds3[0]
   val max = ds3[ds3.size - 1]
    while(ds3.contains(min)){
        ds3.remove(min)
    }

    while(ds3.contains(max)){
        ds3.remove(max)
    }
    println("\n ds3 sau thay đoi: $ds3")
    println(ds3[0])
    println(ds3[ds3.size - 1])
    for(i in ds2.indices){
        if(ds2[i]==ds3[0]){
            print("\t"+i)
        }
        else if(ds2[i]==ds3[ds3.size - 1]){
            print("\t"+i)
        }
    }
}