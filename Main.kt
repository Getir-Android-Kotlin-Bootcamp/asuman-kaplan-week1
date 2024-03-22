import java.io.File
import java.io.FileNotFoundException


fun main() {
    // Page-9
    println("Page-9")
    println("Hi Kotlin!")
    println(41)

    // Page-10
    println("Page-10")
    println("Average of 2 and 4 is ${average(2, 5)}")
    println("Average of 5 and 7 is ${average2(5, 7)}")
    averageUnit(3, 9)

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
    val dog = Dog("Mayki", 3)
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
    println("${timeOfDay(15)}")
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

    //Page-37-38
    println("Page-37-38")
    val book = Book("1984", "George Orwell", 1949, 328)
    book.read()
    book.printDetails()

    // Page-39
    println("Page-39")
    val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddNumbers = numbers2.filter { it % 2 != 0 }
    println("Odd numbers: $oddNumbers")

    // Page-40
    println("Page-40")
    val fruits = listOf("apple", "banana", "orange", "kiwi")
    val fruitToCheck = "banana"

    if (fruitToCheck in fruits) {
        println("$fruitToCheck is in the list.")
    } else {
        println("$fruitToCheck is not in the list.")
    }

    // Page-43-44
    println("Page-43-44")
    val countryCodes = mapOf(
        "TR" to "Türkiye",
        "US" to "United States",
        "CA" to "Canada",
    )

    println("Country Codes:")
    for ((code, country) in countryCodes) {
        println("$code -> $country")
    }
    val countryCode = "TR"
    if (countryCode in countryCodes) {
        val countryName = countryCodes[countryCode]
        println("The country with code $countryCode is $countryName.")
    } else {
        println("Country code $countryCode is not found.")
    }

    // Page-45
    println("Page-45")
    val person = Person("Asuman")
    println("Kişi: ${person.name}")
    println(person.greetings)
    println(person.greetings)

    // Page-46
    println("Page-46")
    val text = "Hello"
    println(text.addUnlem())
    val anotherText = "How are you"
    println(anotherText.addUnlem())

    // Page-47
    println("Page-47")
    Logger.log("Application started")
    Logger.log("User logged in")
    Logger.log("Error occurred")

    //Page-48
    println("Page-48")
    val pizza = Pizza("Margherita Pizza")
    val sushi = Sushi("California Roll")
    pizza.cook()
    pizza.eat()
    sushi.cook()
    sushi.eat()

    // Page-49-50 baska orneklerde gosterilmistir.

    // Page-51
    println("Page-51")
    val x: Int? = null
    val y: Int? = 10
    val result1 = x ?: throw IllegalStateException("x is null")
    val result2 = y ?: throw IllegalStateException("y is null")
    println("Result 1: $result1")
    println("Result 2: $result2")

    // Page-52
    println("Page-52")
    val emptyList = emptyList<String>()
    val firstItem = emptyList.firstOrNull() ?: "Liste boş"
    println("İlk öğe: $firstItem")

    // Page-53
    println("Page-53")
    val str: String? = "Hello"
    str?.let {
        println("String değeri: $it")
        println("String uzunluğu: ${it.length}")
    }

    // Page-55
    println("Page-55")
    val num2 = 5
    val result = when (num2) {
        in 1..3 -> "Küçük"
        4, 5 -> "Orta"
        else -> "Büyük"
    }
    println("Sayı $result")

    // Page-56
    println("Page-56")
    val fileName = "test.txt"
    try {
        val file = File(fileName)
        val text = file.readText()
        println("File content: $text")
    } catch (e: FileNotFoundException) {
        println("File not found: ${e.message}")
    }

    // Page-58
    println("Page-58")
    val temperature = 25
    val weather = if (temperature > 30) {
        "Hot"
    } else if (temperature > 20) {
        "Warm"
    } else {
        "Cool"
    }
    println("The weather is $weather.")

    // Page-59
    println("Page-59")
    println(createFilledArray(5, 42).contentToString())

    // Page-60
    println("Page-60")
    println("The area is ${area()} m^2.")

    // Page-61
    println("Page-61")
    val printer = Printer()
    printer.printDocument("Sample Document")
    printer.printColorDocument("Color Document", "Red")
    printer.scanDocument("Scan Document")
    printer.faxDocument("Fax Document", "+1234567890")

    // Page-65
    println("Page-65")
    val text2 = "Hello, Kotlin!"
    val newText = text2.also {
        println("Original text: $it")
    }.toUpperCase()
    println("Modified text: $newText")

    // Page-67
    println("Page-67")
    println(menu())
    println(menu("FR"))
    println(menu("TR"))

    // Page-68
    println("Page-68")
    val base = 3
    val exponent = 4
    val res = base usHesapla exponent
    println("$base üzeri $exponent = $res") // Çıktı: 3 üzeri 4 = 81

    // Page-69
    println("Page-69")
    val point1 = Point(1, 2)
    val point2 = Point(3, 4)
    val outcome = point1 + point2
    println("(${outcome.x}, ${outcome.y})")

    // Page-70
    println("Page-70")
    printAll(1, "Hello", true, 3.14)

    // Page-84
    println("Page-84")
    var i = 5
    do {
        println("Countdown: $i")
        i--
    } while (i > 0)
    println("Congratulations!")

    // Page-88
    println("Page-88")
    val a = "Hello"
    val b = "Hello"
    val c = "HELLO".toLowerCase()

    println(a == b)  // true, because == is value based
    println(a === b) // true, because === is reference based

    println(a == c)  // true
    println(a === c) // false

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

class Dog(val name: String, age: Int) : Animal("dog", age) {
    override fun makeSound() {
        println("$name barks loudly.")
    }
}

// top of page-15
fun timeOfDay(time: Int) {
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

// top of page-37-38
data class Book(
    val title: String,
    val author: String,
    val publicationYear: Int,
    val pageCount: Int
) {
    fun read() {
        println("You are now reading: $title")
    }

    fun printDetails() {
        println("Title: $title")
        println("Author: $author")
        println("Publication Year: $publicationYear")
        println("Page Count: $pageCount")
    }
}

// top of page-45
class Person(val name: String) {
    val greetings: String by lazy {
        println("Merhaba, $name!")
        "Merhaba, $name!"
    }
}

// top of page-46
fun String.addUnlem(): String {
    return "$this!"
}

// top of page-47
object Logger {
    init {
        println("Logger initialized")
    }

    fun log(message: String) {
        println("Log: $message")
    }
}

// top of page-48
abstract class Food(val name: String, val category: String) {
    abstract fun cook()
    abstract fun eat()
}

class Pizza(name: String) : Food(name, "Italian") {
    override fun cook() {
        println("$name is being baked in the oven...")
    }

    override fun eat() {
        println("Eating $name with joy!")
    }
}

class Sushi(name: String) : Food(name, "Japanese") {
    override fun cook() {
        println("$name is being prepared with rice and fish...")
    }

    override fun eat() {
        println("Enjoying $name with soy sauce and wasabi!")
    }
}

// top of page-59
fun createFilledArray(size: Int, value: Int): IntArray {
    return IntArray(size) { value }
}

// top of page-60
fun area() = 60

// top of page-61
class Printer {
    fun printDocument(document: String) {
        println("Printing document: $document")
    }

    fun printColorDocument(document: String, color: String) {
        println("Printing color document: $document in $color")
    }

    fun scanDocument(document: String) {
        println("Scanning document: $document")
    }

    fun faxDocument(document: String, number: String) {
        println("Faxing document: $document to $number")
    }
}

// top of page-67
fun menu(language: String = "EN"): String {
    val menus = mapOf(
        "EN" to "Menu: Burger - $5, Pizza - $8, Salad - $4",
        "FR" to "Menu: Burger - 5€, Pizza - 8€, Salad - 4€"
    )
    return menus[language] ?: "Menu not available in $language"
}

// top of page-68
infix fun Int.usHesapla(exponent: Int): Int {
    var res = 1
    repeat(exponent) {
        res *= this
    }
    return res
}

// top of page-69
data class Point(val x: Int, val y: Int) {
    // Toplama operatoru (+) icin operator function tanimi
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

// top of page-70
fun printAll(vararg values: Any?) {
    for (value in values) {
        println(value)
    }
}

