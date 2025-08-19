class Car(
    val type: String,
    val model: Int,
    val owner: String,
    val milesDriven: Int,
    val price: Double
) {
    init {
        println("Object of class is created and Init is called.")
    }

    fun getCarInformation() {
        println("Car Information: $type, $model")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDriven")
    }

    fun getOriginalCarPrice(): Double {
        return price
    }

    fun getCurrentCarPrice(): Double {
        return price - (milesDriven.toDouble() * 0.5)
    }

    fun displayCarDetails() {
        println("----------")
        getCarInformation()
        println("Original Car Price: ${getOriginalCarPrice()}")
        println("Current Car Price: ${getCurrentCarPrice()}")
        println("----------")
    }
}

fun main() {
    println("Creating Car Class Object car1 in next line")
    val car1 = Car("BMW", 2018, "Aman", 105, 100000.0)
    car1.displayCarDetails()

    println("Creating Car Class Object car2 in next line")
    val car2 = Car("BMW", 2019, "Karan", 20, 400000.0)
    car2.displayCarDetails()

    println("******* ArrayList of Car ***************")
    val cars = arrayListOf<Car>()
    cars.add(Car("Toyota", 2017, "KJS", 100, 1080000.0))
    cars.add(Car("Maruti", 2020, "NPP", 200, 4000000.0))

    for (c in cars) {
        c.displayCarDetails()
    }
}
