import java.util.*

class Tuoi {
    // khai bao biến năm sinh
    private  var namsinh:Int = 0
    // khai báo pro
    var Namsinh:Int
    get(){return namsinh}
    set(value) {namsinh = value}
    constructor(y:Int)
    {namsinh = y}
    // support method
    private fun CheckTuoi():Boolean{
        var timenow = Calendar.getInstance()
        // lay nam hien tai
        var namhientai= timenow.get(Calendar.YEAR)
        var tuoi = namhientai-namsinh
        return tuoi>=18
    }
    // service method
    fun Ktra(){
        if (CheckTuoi()){
            println("moi dặt vé")
        }
        else
            println("cút")
    }
}