fun main() {
    var num: Int
    do {
        print("Enter a positive nonzero integer value: ")
        num = readLine()?.toIntOrNull() ?: 0
    } while (num <= 0)

    var sum = 0
    for (i in 1..num) {
        sum += i
    }
    println("The sum of all integers leading to $num is $sum")
}
