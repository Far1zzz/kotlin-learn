fun fail(massage : String){
    throw IllegalArgumentException(massage)
}

fun main(){
    fail("Terjadi Kesalahan Fatal")
}