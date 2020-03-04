fun main() {

    // Задание 12
    fun checkYear(year: Int) {
        if (year % 4 == 0) {
            println("Год високосный")
        } else
            println("Год обычный")
    }

    checkYear(2000)
    checkYear(1555)
    println("-----------------------------------------")


    // Задание 13
    fun count(vararg name: String) {
        val count = name.size
        println("Число сотрудников: $count")
    }

    count("Сотрудник1", "Сотрудник2", "Сотрудник3", "Сотрудник4", "Сотрудник5")
    count("Сотрудник1", "Сотрудник2", "Сотрудник3")
    println("-----------------------------------------")

    // Задание 14
    fun getDate(fio: String, position: String) {
        println("Когда есть фио и должность")
    }

    fun getDate(fio: String, position: String, age: Int) {
        println("Когда есть фио, возраст и должность")
    }

    fun getDate(fio: String, position: String, maritalStatus: Boolean) {
        println("Когда есть фио, должность и семейное положение")
    }

    fun getDate(fio: String, position: String, age: Int, maritalStatus: Boolean) {
        println("Когда есть фио, должность, возраст и семейное положение")
    }

    getDate("Пертров М.В.", "продавец")
    getDate("Пертров М.В.", "продавец", 23)
    getDate("Пертров М.В.", "продавец", false)
    getDate("Пертров М.В.", "продавец", 23, false)
    println("-----------------------------------------")

    // Задание 15
    val lambda = { array: Array<String> -> array.forEach(::println) }
    lambda(arrayOf("1", "2", "3"))
    println("-----------------------------------------")

    // Задание 16
    fun Double.sqrt() = kotlin.math.sqrt(this)
    val a = 16.0
    println(a.sqrt())


}