package josecarlos

println("Thanks for joining the talk!")
ask("Should we get started?")
printPausing("Great, so kotlin was designed with a few principles in mind!")



fun ask(vararg question: String) {
    question.forEach { println(it) }
    when (readLine()) {
        "y", "yes" -> return
        "n", "no" -> ask("There's no other option, I'm afraid, let me ask you again...", question.last())
        else -> ask("Invalid option please choose [y/n]", question.last())
    }
}

fun printPausing(message: String) {
    println(message)
    when (readLine()) {
        else -> return
    }
}
