package M4.zadanie24

class AirbusA320(override var numberOfPassengers: Int) : Aircraft(56, 4500, 2300), Passenger {
    override fun print() {
        println("AirbusA320: number=$number, range=$range, capacityFuel=$capacityFuel, numberOfPassengers=$numberOfPassengers")
    }
}