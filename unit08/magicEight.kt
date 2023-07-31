 fun main(){
    val options = arrayOfNulls<Int>(20)
    var isGameOver : Boolean = false
   loop@  while(!isGameOver) {
        val optionsParam = (Math.random() * options.size).toInt()
        println("Ask a Yes or No Answer.")
 
       
        val userChoice = UserSide().getUserInput()
    
        
        if(userChoice == "Exit" || userChoice == "exit"){
            println("Thanks for playing!")
            break
        } else if(userChoice == ""){ 
            println("Please put in a valid answer.")
            continue@loop 
        }

        println("User: $userChoice.")

        
        when (optionsParam) {
            0 -> println("Yes, of course!")
            1 -> println("Without a doubt, yes.")
            2 -> println("You can count on it.")
            3 -> println("For sure!")
            4 -> println("Ask me later.")
            5 -> println("I’m not sure.")
            6 -> println("I can’t tell you right now.")
            7 -> println("I’ll tell you after my nap.")
            8 -> println("No way!")
            9 -> println("I don’t think so.")
            10 -> println("WWithout a doubt, no.")
            11 -> println("The answer is clearly NO.")
           
        }

    }


}

class UserSide {
    fun getUserInput(): String {
        val isValid = false
        var userChoice = ""
        val userInput = readLine()
           if (userInput != null) userChoice = userInput

        return userChoice
    }
}
