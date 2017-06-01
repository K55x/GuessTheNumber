import java.util.*

/**
 * Created by k55x on 31 ماي، 2017 م.
 */
// Game :
// Guess the nember
// Kotlin

fun main ( args : Array<String> ) {

    val maxNumber = 100
    val theNumber = Random().nextInt(maxNumber)
    val numberOfAttempts = 10
    var currentAttempts = 1
    var myGuess : Int?

    println("Guess the number which is between 0 and 100 , you have $numberOfAttempts attempts :")


    while ( currentAttempts <= numberOfAttempts) {

        myGuess = readLine()!!.toInt()

        if (myGuess == theNumber) {
            print("Congratulation you won ! the number is $theNumber")
            break
        } else if (myGuess < theNumber) {
            println("Wrong the number is higher than $myGuess ,\n "+(10 - currentAttempts )+" attempts left , Try Again :")
            currentAttempts++
        } else if (myGuess > theNumber) {
            println("Wrong the number is lower than $myGuess ,\n "+(10 - currentAttempts )+" attempts left , Try Again :")
            currentAttempts++
        } else {
            print("GAME OVER.")
            break
        }
        
    }

    if ( currentAttempts > numberOfAttempts ) print("Game Over , The number is $theNumber")

}
