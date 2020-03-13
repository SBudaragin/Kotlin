package M4.zadanie23

data class Cars(val name: String, val color: String, val number: String) {
}

fun main() {
    arrayOf(Cars("BMW", "white", "345ab"),
            Cars("Mersedes", "black", "35844p"),
            Cars("Audi", "red", "777rt"))
            .forEach(::println)
}