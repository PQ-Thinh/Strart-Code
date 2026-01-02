fun main(args: Array<String>) {
  var thang:Int
  println("moi nhap thg: ")
    var s:String?= readLine()
    thang = s!!.toInt()
    if(thang==1||thang==3||thang==5||thang==7||thang==8||thang==10||thang==12)
        print("Thang : $thang co 31 day")
    else if(thang==4||thang==6||thang==9||thang==11)
        print("thang: $thang co 30 day")
    else if(thang==2) {
        var nam: Int
        println("Moi nhap nam:")
        var x: String? = readLine()
        nam = x!!.toInt()
        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
            print("nam: $nam la nam nhuan nen thang : $thang co 29 day")
        } else print("nam: $nam la nam ko nhuan nen thang : $thang co 28 day")
    }
    else
        print("thg eo co nhap cc a")
}
