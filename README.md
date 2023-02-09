# The basics syntax of Kotlin
## Variables :
 $ Variables: Variables in Kotlin can be declared using the "var" or "val" keywords, with "var" being    mutable and "val" being immutable.  

    var x = 10
    val y = 20   (it's like const u can't change the value )

## Data Types :
    var a: Int = 10
    var b: Double = 10.0
    var c: Char = 'c'
    var d: Boolean = true
    var e: String = "Hello Kotlin"

## Control Structures :
    val x = 10
    if (x > 5) {
        println("x is greater than 5")
    } else {
        println("x is less than or equal to 5")
    }

    for (i in 1..10) {
        println(i)
    } 

## Functions :
    fun add(a: Int, b: Int): Int {
        return a + b
    } 

## Classes :
    class Car {
        var brand: String = ""
        var model: String = ""
    }