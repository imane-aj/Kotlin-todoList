package classPracticing

fun main(){
    val aqua = Aquarium()
    aqua.printSize()
    aqua.height = 30
    aqua.printSize()
    val const = Aquarium(20)
    const.printSize()
}

