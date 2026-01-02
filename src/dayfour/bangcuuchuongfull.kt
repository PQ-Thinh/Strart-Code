package dayfour

fun main(){

    while (true){
        for (i in 1..10){
            for (j in 1..10){
                println(String.format("%d x %d = %d\t ",i,j,(i*j)))
            }
        }
        print("Bạn có muốn tiếp tục không? (yes/no): ")
        val response = readln()
        if (response.lowercase() != "yes") break
    }
}