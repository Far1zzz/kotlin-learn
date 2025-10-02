import kotlin.String
import kotlin.collections.List

fun main() {
    val matkulWjb : MutableList<String> = mutableListOf(
        "Kotlin",
        "Kalkulus",
        "ASD"
    )

    val matkulPil : MutableList<String> =mutableListOf(
        "matkul1",
        "matkul2"
    )

    matkulPil.add("matkul3")

    println(matkulPil[0])
    println(matkulPil[1])
    println(matkulPil[2])
    matkulPil.add(1, "Web 2")
    println(matkulPil[1])

    matkulPil.removeAt(1)
    println(matkulPil)

    val mk = matkulPil + matkulWjb
    println(mk)
}