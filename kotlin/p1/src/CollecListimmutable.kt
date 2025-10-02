fun main() {
    val mataKuliahWajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "ASD"
    )

    println("List matkul wajib : $mataKuliahWajib")
    println("Size list matkul wajib : ${mataKuliahWajib.size}")
    println("Index pertama matkul wajib : ${mataKuliahWajib[0]}")

    val matkulUppcase = mataKuliahWajib.map{
        it.uppercase()
    }

    println("Uppcase : $matkulUppcase")

    val matkulLebihDariKarkter = mataKuliahWajib.filter {
        it.length > 10
    }

    println("matkul>karakter : $matkulLebihDariKarkter")
}