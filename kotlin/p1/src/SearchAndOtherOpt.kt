fun main() {
    val ages: Array<Int> = arrayOf(60, 25, 30, 40, 50)

    println("Ages : ${ages.joinToString()}")

//    sort
    ages.sort()
    println("Ages Sort : ${ages.joinToString()}")

    ages.reverse()
    println("Ages rev : ${ages.joinToString()}")


    println("Slice : ${ages.slice(2 .. 4).joinToString()}")
}