fun main() {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val matrix = createVigenereMatrix1(alphabet)

    // In ra bảng Vigenère
    println("  | ${alphabet}")
    println("  |---${"---".repeat(alphabet.length)}")
    for (i in alphabet.indices) {
        print("${alphabet[i]} | ")
        println(matrix[i]+"")
    }
}

fun createVigenereMatrix1(alphabet: String): Array<String> {
    val matrix = Array(26) { "" }
    for (i in alphabet.indices) {
        var row = ""
        for (j in alphabet.indices) {
            row += alphabet[(i + j) % 26]
        }
        matrix[i] = row
    }
    return matrix
}