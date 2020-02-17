fun main() {

    // Задание 1
    var var1: Any? = null
    var1 = 75
    val var2 = var1 / 2.5
    // Тип переменной var2 - Double


    // Задание 2
    val str1: String = "hello"
    val str2: String = "aplana"
    println("$str1 $str2")

    // Задание 3
    var five: Char = '5'
    var fiveString: String = five.toString()
    var fiveShort: Short = five.toShort()
    var fiveInt: Int = five.toInt()
    var fiveDouble: Double = five.toDouble()
    var fiveFloat: Float = five.toFloat()
    var fiveLong: Long = five.toLong()

    // Задание 4
    println("Введите ваше имя")
    val userName: String? = readLine()
    println("Привет $userName")

    // Задание 5
    var alphabetRange = 'z' downTo 'a'

    // Задание 6
    println("Введите первое число")
    val a = readLine()
    println("Введите второе число")
    val b = readLine()

    var boolean: Boolean = a!!.toDouble() > b!!.toDouble()
}