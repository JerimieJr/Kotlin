fun isNumberDivisible(number: Int, divisor: Int): Boolean {

return ((number % divisor)==0) 
}

fun isPrime(number: Int): Boolean {
    if(number<0)
        return false
        var i = 2
        while (i < number) {
     if (isNumberDivisible(number,i)) {
        return true
    }
      ++i
    }
    return true
}

fun main() {
val num = 1

if (isPrime(num))
println("$num is a prime number.")
else
println("$num is not a prime number.")
}
