class Produit {
    var products =  mutableListOf<String>("Infinix", "Iphone")

    fun add(product:String){
        products.add(product)
        println("product added: $products")
    }
    fun get(){
        println("Your products are: $products")
    }

    fun delete(product:String){
        products.remove(product)
        println("product deleted: $products")
    }

}