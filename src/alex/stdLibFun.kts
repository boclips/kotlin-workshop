package alex

println("The Kotlin stdlib is very powerful - ")
println("Here are some of the most useful functions kotlin has built in")
readLine()

chunkedExample()
readLine()

stringUtilsExamples()
readLine()



fun chunkedExample() {
    println("The chunked function")

    val words = "This will split a character sequence into a list of strings of specified length".split(' ')
    println("words = $words")


    println("words.chunked(3)")
    val chunks = words.chunked(3)
    println(chunks) // [[one, two, three], [four, five, six], [seven, eight, nine], [ten]]
}

fun stringUtilsExamples() {
    val blankWord = ""
    println("blankWord = \"\"")
    if(blankWord.isBlank()) {
        println("Word is blank, pad it out a bit")
        blankWord.padEnd(4, 'o')
        blankWord.padEnd(4, 'k')
    }
    println(blankWord.substringBefore("o", "New word before o"))
    println(blankWord.substringAfter("k","new words after o"))
}





