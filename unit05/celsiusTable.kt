fun celsius(fahrenheit: Double): Double {
return 5.0 / 9.0 * (fahrenheit - 32.0)
}

fun main() {
println("Fahrenheit to Celsius")
for (fahrenheit in 0..20) {
  val celsius = celsius(fahrenheit.toDouble())
   println("$fahrenheit          $celsius")
    }
}
