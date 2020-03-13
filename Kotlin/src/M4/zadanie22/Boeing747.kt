package M4.zadanie22

class Boeing747(override var numberOfPassengers: Int) : Aircraft(39, 5000, 2600), Passenger {
    override fun print() {
        println("number=$number, range=$range, capacityFuel=$capacityFuel, numberOfPassengers=$numberOfPassengers")
    }
}