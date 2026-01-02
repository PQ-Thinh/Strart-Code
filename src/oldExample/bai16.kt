fun main(args: Array<String>) {
//    for(i in 1..5){
//        for(j in 1..i) {
//            println("$i*$j=${i * j}")
//        }
//    }
    var h=7
    for(i in 1..h){
        for(j in 1..h){
           if(i==h || i==h-3+1)
               print("$i$j")
           print("\t")
        }
        println()
    }
}