fun main() {
    var score = 0
    val answer1 = "Sephiroth"
    val answer2 = "Buster Sword"
    val answer3 = "Cid"
    val answer4 = "Squall"
    val answer5 = "Lunafreya"

    // CREATES FUNCTION TO CHECK IF THE USER GOT THE QUESTION CORRECT
    fun checkScore(a: Int){
        if (a == 0){
            score++
        }
    }

    //INTRO
    println("Welcome to the ultimate Final Fantasy quiz!")
    println("First question")

    print("Which antagonist killed Aerith in Final Fantasy 7: ")
    var userAns = readLine()!!.toString() //GETS USER INPUT

    var result = userAns.compareTo(answer1, ignoreCase = true) //COMPARES USER INPUT AND CORRECT ANSWER

    checkScore(result)

    println("Second Question")

    print("What is the name of the iconic sword Cloud uses in Final Fantasy 7: ")
    userAns = readLine()!!.toString()

    result = userAns.compareTo(answer2, ignoreCase = true)

    checkScore(result)

    println("Third Question")

    print("What name appears in every Final Fantasy game: ")
    userAns = readLine()!!.toString()

    result = userAns.compareTo(answer3, ignoreCase = true)

    checkScore(result)

    println("Fourth Question")

    print("What was the name of the protagonist in Final Fantasy VIII: ")
    userAns = readLine()!!.toString()

    result = userAns.compareTo(answer4, ignoreCase = true)

    checkScore(result)

    println("Third Question")

    print("Who is the bride of Prince Noctis in Final Fantasy XV: ")
    userAns = readLine()!!.toString()

    result = userAns.compareTo(answer5, ignoreCase = true)

    checkScore(result)

    print("Your final score was $score out 5") // DISPLAYS THE FINAL SCORE

}