fun main() {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val key = "LEMON"
   val plaintext = "ATTACKATDAWN"

    //Tạo ma trận Vigenère
    val vigenereMatrix = createVigenereMatrix(alphabet)

     //Mã hóa
    val ciphertext = encryptVigenere(plaintext, key, vigenereMatrix, alphabet)

    println("Bản mã: $ciphertext")
}

fun createVigenereMatrix(alphabet: String): Array<String> {
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

fun encryptVigenere(plaintext: String, key: String, matrix: Array<String>, alphabet: String): String {
    val fullKey = generateFullKey(plaintext, key)
    var ciphertext = ""
    for (i in plaintext.indices) {
        val keyIndex = alphabet.indexOf(fullKey[i])
        val textIndex = alphabet.indexOf(plaintext[i])
        ciphertext += matrix[keyIndex][textIndex]
    }
    return ciphertext
}

fun generateFullKey(text: String, key: String): String {
    val fullKey = StringBuilder()
    var keyIndex = 0
    for (i in text.indices) {
        fullKey.append(key[keyIndex])
        keyIndex = (keyIndex + 1) % key.length
    }
    return fullKey.toString()
}