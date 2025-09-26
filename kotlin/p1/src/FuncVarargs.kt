fun test(fName : String, vararg users : String){
    println(fName)
    for (user in users){
        println(user)
    }
}

fun main() {
//    test("TEST", "us1", "us2")
}