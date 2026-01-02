package dayone
fun main(){
    var squareLength:Int;
   while (true){
       print("nhập vào  squareLength: ")
       squareLength= readln()!!.toInt()
       println("Perimetrr: "+(squareLength*4))
       println("Area: "+(squareLength*squareLength))
       if (squareLength==0)
           break
   }
}
