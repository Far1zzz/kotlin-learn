fun hitungPanjangNama(name: String?): Int {
    return if (name != null) name.length else 0
}

fun main() {
    val nama1: String? = "satu"
    val nama2: String? = null

    println("Panjang nama1: ${hitungPanjangNama(nama1)}")
    println("Panjang nama2: ${hitungPanjangNama(nama2)}")
}
