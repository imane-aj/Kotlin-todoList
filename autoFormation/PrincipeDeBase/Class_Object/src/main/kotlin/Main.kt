fun main(args: Array<String>) {
   val products = Produit()
    while(true) {
        println("\n Enter your choice: \n-1: to add new product \n-2: To see your products \n-3: To delete a product \n-4: to Exit")
        val choice = readln()!!
        when(choice) {
            "1" -> {
               println("Enter your product: ")
                val product = readln()!!
                products.add(product)
            }
            "2" -> {
                products.get()
            }
            "3" -> {
                println("witch product do you like to delete [${products.products}]")
                val product = readln()!!
                products.delete(product)
            }
            "4" -> break
            else -> println("You're out")
        }
    }
}