fun getGameChoice(optionsParam: Array<String>) =
        optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    println("Please enter one of the following:")
    for (item in optionsParam) print(" $item")
    println(".")
    val userInput = readLine()
}

fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
}
