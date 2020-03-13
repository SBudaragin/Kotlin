package M4.zadanie17

class Aircraft {
    var number = 5
    var range = 3000
    var capacityFuel = 500
    var consumption = 5
        get() = range / capacityFuel
}