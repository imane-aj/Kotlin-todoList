package productswithIn

class Product: IproductMang{
    private val products = mutableListOf<String>("Phone", "Tv");
    override fun add(name: String) {
        products.add(name)
        println("Your product has been added")
    }

    override fun get() {
        println("Your products: $products")
    }

    override fun delete(name: String) {
        products.remove(name)
        println("Your product has been deleted")
    }

}
