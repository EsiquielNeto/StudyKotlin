package poo.model

class Mobile constructor(
    var brand: String,
    var model: String,
    var price: Double,
    var discount: Double
) {

    fun getActualPrice(): Float {
        return (price - discount).toFloat()
    }

    fun printDetails() {
        println("Mobile details:")
        println("Brand: $brand")
        println("Model: $model")
        println("Price: $price")
        println("Discount: $discount")
        println("Total price: ${getActualPrice()}")
    }

}