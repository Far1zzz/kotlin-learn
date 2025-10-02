fun procces(){
    val nilai = intArrayOf(80, 90, 99, 40)  // Ini IntArray primitive

    val ttl = nilai.sum()
    val rataRata = nilai.average()

    println("Total nilai: $ttl")
    println("Rata-rata nilai: $rataRata")
}

fun main() {
    procces()
}


