package M4.zadanie24

fun main() {
    val listAircrafts = ArrayList<Aircraft>()
    listAircrafts.add(Boeing747(166))
    listAircrafts.add(AirbusA320(150))
    listAircrafts.add(Il96(6000))

    loop@ while (true) {
        println("Выберите дейсвтие:")
        println("Для просмотра всех самолетов нажмите 1")
        println("Для просмотра пассажирских самолетов нажмите 2")
        println("Для просмотра грузовых самолетов нажмите 3")
        println("Для выхода нажмите 4")
        try {
            when (readLine()) {
                "1" -> listAircrafts.forEach { it.print() }
                "2" -> listAircrafts.filter { it is Passenger }.forEach { it.print() }
                "3" -> listAircrafts.filter { it is CarringCapacity }.forEach { it.print() }
                "4" -> break@loop
                else -> println("Не корректный ввод")
            }
        } catch (e: Exception) {
            println("Не корректный ввод")
        }
    }
}