package M4.zadanie24

class Il96(override var weight: Int) : Aircraft(8889, 6900, 6300), CarringCapacity {
    override fun print() {
        println("Il-96: number=$number, range=$range, capacityFuel=$capacityFuel, weight=$weight")
    }
}