fun procArrayGeneric(){
    val jumlahData = 1_000_0000
    val waktuMulai = System.nanoTime()

    val dataSensor = Array(size = jumlahData){
        it + 1
    }

    var total : Long = 0
    for (data in dataSensor){
        total += data
    }

    val rataRata =  total.toDouble()
    val wktSelesai = System.nanoTime()
    val durasiMs = (wktSelesai - waktuMulai) / 1000_000.0

    println("Jumlah Data : $jumlahData")
    println("Total : $total")
    println("rata-rata : $rataRata")
    println("Durasi Ms : $durasiMs")
}

fun primitiveArrayProc(){
    val jumlahData = 1_000_0000
    val waktuMulai = System.nanoTime()

    val dataSensor = IntArray(size = jumlahData){
        it + 1
    }

    var total : Long = 0
    for (data in dataSensor){
        total += data
    }

    val rataRata =  total.toDouble()
    val wktSelesai = System.nanoTime()
    val durasiMs = (wktSelesai - waktuMulai) / 1000_000.0

    println("Jumlah Data : $jumlahData")
    println("Total : $total")
    println("rata-rata : $rataRata")
    println("Durasi Ms : $durasiMs")
}

fun main() {
    procArrayGeneric()
    primitiveArrayProc()
}