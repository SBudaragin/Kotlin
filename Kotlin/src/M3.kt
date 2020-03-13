fun main() {

    // Задание 12
    fun checkYear(year: Int): String {
        return if (year % 4 == 0) {
            "Год високосный"
        } else
            "Год обычный"
    }

    // Задание 13
    fun count(vararg name: String): Int = name.size

    // Задание 14
    fun getDate(fio: String, position: String) {
        println("ФИО: $fio, должность: $position")
    }

    fun getDate(fio: String, position: String, age: Int) {
        println("ФИО: $fio, возраст:$age, должность: $position")
    }

    fun getDate(fio: String, position: String, maritalStatus: Boolean) {
        println("ФИО: $fio, должность: $position, семейное положение: $maritalStatus")
    }

    fun getDate(fio: String, position: String, age: Int, maritalStatus: Boolean) {
        println("ФИО: $fio, возраст:$age, должность: $position, семейное положение: $maritalStatus")
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