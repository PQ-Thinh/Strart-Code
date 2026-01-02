class LopSV_2 {
    var ma:Int=0
    var ten:String=""
    private  var diemtoan:Float=0f
    // khai báo properties
    var Diemtoan:Float
    get() {return diemtoan}
    set(value) {diemtoan=value}
    private  var diemvan:Float=0f
    // khai báo properties
    var Diemvan:Float
        get() {return diemvan}
        set(value) {diemvan=value}
    constructor(){// khỏi tạo không đối số
        ma=0
        ten="No name"
    }
    constructor(m:Int,t:String){ // khỏi tạo có đối số
       ma=m// this.ma=ma
       ten=t// this.ten=ten
    }
//1. ham tinh TB
    fun DTB(diemtoan:Float,diemvan:Float):Float{
        return (diemtoan+diemvan)/2
    }
    // 2. xuat tt sv
    fun XuatTT(){
        println("ten sv là $ten ")
        println("ma sv là $ma ")
    }
    //3.tóstring
    override fun toString(): String {
        return "ma sinh vien: $ma diemtoan: $diemtoan"
    }
}