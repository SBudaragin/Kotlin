package M4.zadanie24

class Boeing747(override var numberOfPassengers: Int) : Aircraft(39, 5000, 2600), Passenger {
    override fun print() {
        println("Boeing747: number=$number, range=$range, capacityFuel=$capacityFuel, numberOfPassengers=$numberOfPassengers")
    }
}