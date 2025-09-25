fun main() {
    val myInt : Int =120
    val myByte :Byte = myInt.toByte()

    println(myByte)

    val myInt2 :Int = 130
    val myByte2 :Byte = myInt2.toByte()
    println(myByte2)
    println(Integer.toBinaryString(myInt2).padStart(length =32, padChar = '0'))

    // Byte :8 bit
    // 10000010
    // kalau bit pertama 0 -> POSITIF
    // kalau bit pertama 1 -> NEGATIF

    // Inverst biner (0 -> 1 , 1 ->0 )
    // 01111101 (125 + 1 = -126)
    
}