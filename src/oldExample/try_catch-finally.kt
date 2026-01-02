
fun Thuong(a:Int,b:Int):Int{
    if(b==0)
        throw Exception("Mau eo chia dc")
    return a/b
}



fun main(args: Array<String>) {
//    var a=10
//    var b=0
//    try {
//        var c= a/b
//        println(c)
//    }catch (e:Exception){
//       e.printStackTrace()
//    }
//    finally {
//        println("Thoat khoi database")
//    }
//    println("loi lol ol")
    try {// chua doan code nghi ngo co loi va bat loi
       var c = Thuong(5,0)
        println(c)
    }catch (e:Exception){ //thong bao loi
        println(e.message)
    }finally {// doan code van chay khi co loi
        println("da dang xuat khoi csdl")
    }

    println("dau dit qua")
}