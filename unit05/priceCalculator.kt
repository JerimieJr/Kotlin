fun main() {
   println("Enter item's wholesale cost: ")
   val wholesaleCost = readLine()!!.toDouble()
   println("Enter item's markup percentage: ")
   val markupPercentage = readLine()!!.toDouble()
   println("The item's retail price is ${finalRetail(wholesaleCost, markupPercentage)}")
}
fun finalRetail(wholesaleCost: Double, markupPercentage: Double): Double {
   return wholesaleCost + (wholesaleCost * markupPercentage / 100)
}
