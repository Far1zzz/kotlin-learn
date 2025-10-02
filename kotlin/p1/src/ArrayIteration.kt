fun main() {
    val user : Array<String> = arrayOf("User 1", "User 2")

    user.forEach {
        println("Foreach : $it")
    }

    user.forEachIndexed { index, user ->
        println("Foreach: ${index + 1} : $user")
    }
}