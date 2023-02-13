fun main(args: Array<String>) {
    val h = 0

    for (x in 5 downTo h) {
        for (j in 5 downTo h + x + 1) {
            print(" ")
        }
        for (col in 0 until 2 * x + 1) {
            print("*")
        }
        println()

    }

}
