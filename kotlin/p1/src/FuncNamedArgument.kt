fun calculate(
    k1 : Double,
    k2 : Double,
    t1 : Double,
    t2 : Double,
    uts : Double,
    uas : Double
){
  println((k1+k2+t1+t2+uts+uas)/6)
}

fun main() {
    calculate(k1 = 10.6, k2 = 10.0, uts = 100.0, uas = 100.0, t1 = 10.2, t2 = 10.0  )
}