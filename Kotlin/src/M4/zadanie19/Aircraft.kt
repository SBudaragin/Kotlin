package M4.zadanie19

open class Aircraft(number: Int, range: Int, capacityFuel: Int) {
    var number: Int
    var range: Int
    var capacityFuel: Int
    var consumption = 5
        get() = range / capacityFuel

    init {
        this.number = number
        this.range = range
        this.capacityFuel = capacityFuel
    }


}