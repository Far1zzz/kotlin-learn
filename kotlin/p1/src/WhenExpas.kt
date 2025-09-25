fun main() {
    val finalExam = 'A'
    val nilaiLulus = arrayOf('A', 'B')

    when(finalExam){
        'A' -> println("Lulus")
        'B' -> println("Lulus juga")
        'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }

    when(finalExam){
        'A', 'B' -> println("Lulus")
        'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }

    when{
        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
        finalExam == 'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }

//    var status1 = false
//
//    when(finalExam){
//        'A', 'B' -> status1 = true
//        else -> status1 = false
//    }

    var status1 = when(finalExam){
        'A', 'B' -> true
        else -> false
    }

    println(status1)

    var score = 12
    var status = ""

    when {
        score > 80 -> status = "Lulus"
        score == 12 -> status = "Remedial"
        else -> status = "Tidak Lulus"
    }
    println(status)

    when(finalExam){
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak lulus")
    }

    when(finalExam){
        is Char -> println("Ya, ini char")
        is String -> println("Ini String")
        !is Char -> println("Bukan char")
    }
}