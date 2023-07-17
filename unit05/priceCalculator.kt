fun main() {
   println("Enter the item's wholesale cost: ")
   val wholesaleCost = readLine()!!.toDouble()
   println("Enter the item's markup percentage: ")
   val markupPercentage = readLine()!!.toDouble()
   println("The item's retail price is ${calculateRetail(wholesaleCost, markupPercentage)}")
}
fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
   return wholesaleCost + (wholesaleCost * markupPercentage / 100)
}
