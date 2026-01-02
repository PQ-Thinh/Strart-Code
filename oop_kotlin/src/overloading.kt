class overloading {
    //insrance var
    private var maSP:Int = 0
    private var tenSP:String=""
    private var giaSP:Double=0.0
    // contructor
    constructor(maSP:Int, tenSP:String, giaSP:Double) {
        this.maSP = maSP
        this.tenSP = tenSP
        this.giaSP = giaSP
    }
    constructor(maSP:Int, tenSP:String) {
        this.maSP = maSP
        this.tenSP = tenSP
    }
    fun ChietKhau():Double{
        return this.giaSP*0.95
    }
    fun ChietKhau(sinhnhat:Boolean):Double{
        if(sinhnhat){return this.giaSP*0.9}
        else
            return this.giaSP*0.95
    }
}