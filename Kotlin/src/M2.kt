fun main() {

    // Задание 7
    var count = 0
    println("Тест устного счета")
    println("Вопрос 1: 99+122")
    println("1: 221 или 2: 211")
    if (readLine().equals("1")) count++

    println("Вопрос 2: 15*15")
    println("1: 255 или 2: 225")
    if (readLine().equals("2")) count++

    println("Вопрос 3: 1092-304")
    println("1: 778 или 2: 788")
    if (readLine().equals("2")) count++

    println("Вопрос 4: 81/3")
    println("1: 9 или 2: 27")
    if (readLine().equals("2")) count++

    println("Вопрос 5: 10*0")
    println("1: 0 или 2: 1")
    if (readLine().equals("1")) count++

    when (count) {
        in 0..1 -> println("Результат $count из 5, не расстраивайся")
        in 2..3 -> println("Результат $count из 5, неплохо")
        in 4..5 -> println("Результат $count из 5, cупер")
    }
    println("-----------------------------------------")

    // Задание 8
    var percent = 0
    var startAmount = 0
    var mounts = 0
    var i = 0

    println("введите начальную сумму")
    startAmount = readLine()!!.toInt()
    println("введите процент вклада в месяц")
    percent = readLine()!!.toInt()
    println("введите срок вклада месяцах")
    mounts = readLine()!!.toInt()
    var totalAmount = startAmount

    while (++i <= mounts) {
        val dif = totalAmount * percent / 100
        totalAmount += dif
        println("$i месяц - вклад увеличен на: $dif - общая сумма: $totalAmount")
    }
    println("-----------------------------------------")

    // Задание 9
    val array = arrayOf(arrayOf("Russia", "England", "Spain"), arrayOf("Moscow", "London", "Madrid"), arrayOf("rubles", "euro", "euro"))
    (array[0].indices).forEach { i ->
        for (j in array) {
            print(j[i] + " ")
        }
        println()
    }
    println("-----------------------------------------")

    // Задание 10
    val list = ArrayList<String>()
    loop@ while (true) {
        println("Выберите дейсвтие:")
        println("Для добавления города нажмите 1 и введите город")
        println("Для просмотра списка городов нажмите 2")
        println("Для просмотра списка уникальных городов нажмите 3")
        println("Для выхода нажмите 4")
        try {
            when (readLine()) {
                "1" -> list.add(readLine()!!)
                "2" -> list.forEach(::println)
                "3" -> list.toSet().forEach(::println)
                "4" -> break@loop
                else -> println("Не корректный ввод")
            }
        } catch (e: Exception) {
            println("Не корректный ввод")
        }
    }
    println("-----------------------------------------")

    // Задание 11
    val map: Map<String, String> = mapOf("1" to "Петров П.П.", "2" to "Иванов И.И.", "3" to "Смирнов С.С")
    println("Введите номер номер рабочего места")
    println(map[readLine()] ?: "Место не найдено")

}