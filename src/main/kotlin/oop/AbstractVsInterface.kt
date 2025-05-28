package oop

fun main() {
    val car = Car("Tesla", 2025)
    car.start()
    car.drive()
    car.stop()

    println("---")

    val scooter = ElectricScooter("Xiaomi")
    scooter.drive()
    scooter.stop()
    scooter.chargeBattery()
}

interface Drivable {
    fun drive()

    fun stop() {
        println("Stopping the vehicle.")
    }
}

abstract class Vehicle(
    val brand: String,
    val year: Int
) {
    fun start() {
        println("Starting $brand ($year)")
    }

    abstract fun stop()
}

class Car(
    brand: String,
    year: Int
) : Vehicle(brand, year), Drivable {
    override fun drive() {
        println("$brand is driving on the road.")
    }

    override fun stop() {
        println("$brand is braking to stop.")
    }
}

class ElectricScooter(
    private val model: String
) : Drivable {
    override fun drive() {
        println("Scooter $model is gliding silently.")
    }

    fun chargeBattery() {
        println("Charging $model battery...")
    }
}
