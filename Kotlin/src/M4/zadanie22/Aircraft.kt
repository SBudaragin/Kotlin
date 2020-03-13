package M4.zadanie22

abstract class Aircraft(number: Int, range: Int, capacityFuel: Int) {
    protected var number: Int
    protected var range: Int
    protected var capacityFuel: Int
    protected var consumption = 5
        get() = range / capacityFuel

    init {
        this.number = number
        this.range = range
        this.capacityFuel = capacityFuel
    }

    open fun print() {
        println("number=$number, range=$range, capacityFuel=$capacityFuel")

    }


}