fun main() {
    //1. Khai báo mutablelist
    val ds1: MutableList<Int> = mutableListOf()
    println(ds1::class.java.typeName)

    // 2. List (read only)
    val ds2: List<Int> = listOf()
    println(ds2::class.java.typeName)

    // khoi tao
    val ds3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println(ds3)


    val ds4: List<Int> = listOf(5, 7, 6, 8)
    println(ds4)

    val ds5: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 7, 6)
    println(ds5.indices)
    for (i in ds5.indices) {
        //println(ds5[i])
        if (ds5[i] % 2 == 0)
            print(ds5[i])
    }
    // size
    println()
    val ds6: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println(ds6.size)

    // add thêm 1 phần tử
    ds6.add(7)
    println(ds6)
    ds6.add(2, 3)
    println(ds6)


    // add all
    ds6.addAll(mutableListOf(6, 7, 8, 9))
    println(ds6)
    // thêm vào vị trí index mong muốn
    ds6.addAll(0, mutableListOf(6, 7, 8, 9))
    println(ds6)

    // removeAt (xóa tại 1 vị trí index chỉ định)
    ds6.removeAt(5)
    println(ds6)

    // remove ( xóa pt đầu tiên trùng khớp)
    ds6.remove(6)
    println(ds6)

    // sort tăng dần
    ds6.sort()
    println(ds6)

    // giảm
    ds6.sortDescending()
    println(ds6)

    // filter xét điều kiện số nguyên --lọc có dk
    val ds7 = ds6.filter { it % 2 == 0 }
    println(ds7)

    // contains() ktra có tôn tại trong ds  ko
    println(ds6.contains(3))

    // clear
    ds6.clear()
    println(ds6)


    // list thường
//    var ds8:List<Int> = listOf(1,2,3,4,5)
//    ds8[0]

// gộp list
//var quest:List<Pair<String, Int>> = listOf("2 + 5 +7 =" to 14,
//        "5*10 =" to 50,
//        "sqrt(16) =" to 4,
//        "12%2 =" to 0)

    // tạo bản sao clone
//    var ds17: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
//    var ds18= ds17.toMutableList()
//    println(ds18)

    // tạo bản sao lọc phân tử có đk thông qua map
//    val ds19: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
//    val ds20= ds19.map { it * it }.toMutableList()
//    println(ds20)
}