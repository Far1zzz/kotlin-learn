fun main() {
    val ages : Array<Int> = arrayOf(25, 20, 23, 34)

    println("Sum : ${ages.sum()}")
    println("Avg : ${ages.average()}")
    println("Max Or Null : ${ages.maxOrNull()}")
    println("Min or Null : ${ages.minOrNull()}")
    println("Count : ${ages.count()}")
}