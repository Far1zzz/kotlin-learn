fun main() {
    println("Nama Kamu ?")
    val name = readln()

    println("Umur Kamu ?")
    val ageInput = readln()
    val age = ageInput.toIntOrNull()

    if (age != null){
        println("Nama Kamu : $name")
        println("Umur kamu : $age")
    }else{
        println("Umur belom valid")
    }
}