package alex

println("The Kotlin stdlib is very powerful")
readLine()

println("Here are some of the most useful functions kotlin has built in")
readLine()

chunkedExample()


fun chunkedExample() {
    println("The chunked function")
    readLine()

    val words = "This will split a character sequence into a list of strings of specified length".split(' ')
    println("words = $words")
    readLine()

    println("words.chunked(3)")
    val chunks = words.chunked(3)
    readLine()

    println(chunks) // [[one, two, three], [four, five, six], [seven, eight, nine], [ten]]
}

