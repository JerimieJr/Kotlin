fun main() {
    println("Guess my number that's between 0 and 100.")
    val answer = Random.nextInt(0, 100) 
    var guess: Int? = null 
    while (guess != answer) {
    print("Enter your guess: ")
    guess = readLine()?.toIntOrNull()

    if (guess == null) {
    println("Invalid input, please enter a number.")
} else if (guess < 0 || guess > 100) {
    println("Please enter a number between 0 and 100.")
} else if (guess < answer) {
    println("Too low, try again.")
} else if (guess > answer) {
    println("Too high, try again.")
 } else {
    println("Congratulations, you guessed the number!")
}
}
}
