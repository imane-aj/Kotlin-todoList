var product = mutableListOf<String>()

fun getProduct(){
    for(element in product){
        println(element)
    }
}
fun addProduct(pro:String) {
    product.add(pro)
    println("Product added: $product")
}

fun deleteProduct(pro: String) {
    if (product.remove(pro)) {
        println("Product deleted: $product")
    }else{
        println("This product don't exist")
    }
}


fun main() {
    while (true) {
        println("Enter Add to add product, Delete to delete product, Get to get all products," +
                " or Exit to exit")
        val choice = readLine()!!
        when (choice) {
            "Add" -> {
                print("Enter Product: ")
                val product = readLine()!!
                addProduct(product)
            }
            "Delete" -> {
                print("Enter product to delete: ")
                val product = readLine()!!
                deleteProduct(product)
            }
            "Get" -> {
                print("All your Product: ")
                getProduct()
            }
            "Exit" -> break
            else -> println("You are out")
        }
    }
}
