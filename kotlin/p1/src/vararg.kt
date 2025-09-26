fun test(vararg tst : String) {
    for (res in tst) {
        println(res)
    }
}

fun main() {
    val result = arrayOf("Halo", "Selamat Pagi", "Kotlin", "Array")
    test(result)
}

