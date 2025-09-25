fun main() {

    println("Masukkan nama pemain:")
    val namaPemain: String = readLine() ?: "Pemain"

    var kesehatanPemain = 100
    var punyaKunciEmas = false
    var jumlahPotion = 2
    var sedangBermain = true

    fun tampilkanStatus() {
        println("\nStatus Pemain:")
        println("Nama: $namaPemain")
        println("Kesehatan: $kesehatanPemain")
        println("Jumlah Potion: $jumlahPotion")
        println("Punya Kunci Emas: ${if (punyaKunciEmas) "Ya" else "Tidak"}")
    }

    tampilkanStatus()

    while (sedangBermain) {

        if (kesehatanPemain <= 0) {
            println("Kesehatanmu sudah habis. Kamu kalah!")
            sedangBermain = false
            break
        }

        println("\nDidepan kamu terdapat 2 buah jalur (1, 2) : ")
        println("1). Jalur gelap dan seram")
        println("2). Jalur tenang dan sunyi")
        print("Pilih jalur (1/2): ")
        val pilihanJalur = readLine()

        when (pilihanJalur) {
            "1" -> {

                println("\nKamu berada disebuah ruangan dengan tiga patung : naga, griffin, dan ular")
                print("Pilih patung (naga/griffin/ular): ")
                val pilihanPatung = readLine()?.lowercase()

                when (pilihanPatung) {
                    "naga" -> {
                        println("Patung naga mengeluarkan api! Kesehatanmu berkurang 35 poin.")
                        kesehatanPemain -= 35
                        tampilkanStatus()
                    }
                    "griffin" -> {
                        println("Patung griffin memberimu kunci emas!")
                        punyaKunciEmas = true
                        println("\nKamu menggunakan kunci emas dan menemukan artefak kuno!")
                        sedangBermain = false
                    }
                    "ular" -> {
                        println("Patung ular menggigitmu! Kesehatanmu berkurang 15 poin.")
                        kesehatanPemain -= 15
                        tampilkanStatus()
                    }
                    else -> {
                        println("Kamu tidak memilih patung yang benar dan tidak terjadi apa-apa.")
                        tampilkanStatus()
                    }
                }

                if (sedangBermain) {  // Hanya tanya potion kalau permainan belum selesai
                    if (jumlahPotion > 0 && kesehatanPemain > 0) {
                        print("Apakah kamu ingin menggunakan potion? (y/n): ")
                        val pakaiPotion = readLine()?.lowercase()
                        if (pakaiPotion == "y") {
                            jumlahPotion--
                            kesehatanPemain += 10
                            if (kesehatanPemain > 100) {
                                kesehatanPemain = 100
                            }
                            println("Kamu menggunakan potion. Kesehatanmu bertambah 10 poin.")
                            tampilkanStatus()
                        }
                    }
                }

                if (sedangBermain && !punyaKunciEmas) {
                    println()
                    println("Pintu terkunci dan membutuhkan kunci emas. Kamu harus cari kunci dulu.")
                }
            }

            "2" -> {

                println("\nKamu menginjak perangkap tersembunyi! Kesehatanmu berkurang 25 poin.")
                kesehatanPemain -= 25
                tampilkanStatus()

                if (kesehatanPemain <= 0) {
                    println("Kesehatanmu sudah habis akibat perangkap. Kamu kalah!")
                    sedangBermain = false
                }
            }

            else -> {
                println("Pilihan tidak valid. Silakan pilih 1 atau 2.")
            }
        }
    }

    println("\nPermainan selesai. Terima kasih sudah bermain, $namaPemain!")
}
