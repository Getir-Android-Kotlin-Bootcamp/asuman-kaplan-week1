package com.example.hafta1_odev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main() {
        // Page-9
        println("Page-9")
        println("Hi Kotlin!")
        println(41)

        // Page-10
        println("Page-10")
        println("Average of 2 and 4 is ${average(2,5)}")
        println("Average of 5 and 7 is ${average2(5,7)}")
        averageUnit(3,9)

        // Page-11
        println("Page-11")
        val name = "Asuman"
        println("Name: $name")
        var age: Int = 22
        println("Age: $age")
        age = 23
        println("Updated Age: $age")

        // Page-12
        println("Page-12")
        val car = Vehicle("Ford", "Mustang")
        car.getInfo()

        // Page-13
        println("Page-13")
        val animal = Animal("cat", 5)
        animal.makeSound()
        val dog = Dog("Buddy", 3)
        dog.makeSound()
        
        // Page-14
        println("Page-14")
        val name1 = "Asuman"
        val age1 = 22
        val message1 = "My name is $name1 and I am $age1 years old."
        val message2 = "$message1 In 10 years, I will be ${age1 + 10} years old."

        println(message1)
        println(message2)

        // Page-15
        println("Page-15")
        println("${greetTimeOfDay(15)}")
        val num = 5
        println("$num is ${isPositive(num)}.")

        // Page-16
        println("Page-16")
        val numbers = arrayOf(1, 2, 3, 4, 5)
        var sum = 0
        for (number in numbers) {
            sum += number
        }
        println("Sum of numbers: $sum")

        // Page-17
        println("Page-17")
        var number = 3
        while (number <= 10) {
            println("Square of $number is ${number * number}")
            number++
        }

        // Page-18
        println("Page-18")
        printValue("Hello")
        printValue(10)
        printValue(3.14)
        printValue(true)

        // Page-19
        println("Page-19")
        val startFloor = 1
        val endFloor = 10
        val currentFloor = 5
        val floorRange = startFloor..endFloor

        println("Ali is in a building with $endFloor floors.")
        println("He is currently on floor $currentFloor.")

        if (currentFloor in floorRange) {
            println("He is somewhere between floors $startFloor and $endFloor.")
        } else {
            println("He is not in the building.")
        }

        println("He decides to go to the top floor using the elevator.")

        for (floor in currentFloor until endFloor) {
            println("Now he is on floor $floor.")
        }

        println("He has reached the top floor.")

        // Page-20
        println("Page-20")
        val cities = listOf("London", "Paris", "New York", "Tokyo", "Sydney")
        cities
            .filterNot { it.contains("o") }
            .sortedByDescending { it.length }
            .map { it.toLowerCase() }
            .forEach { println(it) }

        // Page-21
        println("Page-21")
        var name2: String? = "John"
        if (name2 != null) {
            println("Hello, $name!")
        } else {
            println("Hello, guest!")
        }

        // Page-22





    }
    // top of page-10
    fun average(a: Int, b: Int): Int {
        return (a + b) / 2
    }
    fun average2(a: Int, b: Int) = (a + b) / 2
    fun averageUnit(a: Int, b: Int): Unit {
        println("Average of $a and $b is ${(a + b) / 2}")
    }
    // top of page-12
    class Vehicle(val brand: String, val model: String) {
        fun getInfo() {
            println("Brand: $brand, Model: $model")
        }
    }
    // top of page-13
    open class Animal(val species: String, val age: Int) {
        open fun makeSound() {
            println("The $species makes a sound.")
        }
    }
    class Dog(val name: String, age: Int): Animal("dog", age) {
        override fun makeSound() {
            println("$name barks loudly.")
        }
    }
    // top of page-15
    fun greetTimeOfDay(time: Int) {
        if (time < 12) {
            println("Good morning!")
        } else if (time < 18) {
            println("Good afternoon!")
        } else {
            println("Good evening!")
        }
    }
    fun isPositive(number: Int) = if (number > 0) "positive" else "non-positive"
    //top of page-18
    fun printValue(value: Any) {
        when (value) {
            is String -> println("String value: $value")
            is Int -> println("Integer value: $value")
            is Double -> println("Double value: $value")
            else -> println("Unknown value type")
        }
    }
    //










}


