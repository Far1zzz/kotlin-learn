fun main () {
    val myInt : Int = 30000
    val myShort : Short = myInt.toShort()
    println(myShort)

    val myInt2 : Int = 40000
    val myShort2 : Short = myShort.toShort()
    println(myShort2)

    println (Integer.toBinaryString(myInt2).padStart(length =32, padChar = '0'))

    // biner dari 40000 = 1001110001000000 (rentang 16 bit)
    // karena awalan 1 maka hasil akhir pasti NEGATIF
    // Lakukan invert biner
    // 01100011 10111111
    // covert ke desimal
    // 25535 hasil konversi desimal
}