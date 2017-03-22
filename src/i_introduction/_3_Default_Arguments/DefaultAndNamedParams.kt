package i_introduction._3_Default_Arguments

fun todoTask3(name: String, number: Number, toUpperCase: Boolean): String {
    if (toUpperCase) {
        return (name + number).toUpperCase()
    } else {
        return name + number
    }
}

fun foo(name: String, number: Number = 42, toUpperCase: Boolean = false): String = todoTask3(name, number, toUpperCase)

fun task3(): String {
    return (foo("a") +
            foo("b", number = 1) +
            foo("c", toUpperCase = true) +
            foo(name = "d", number = 2, toUpperCase = true))
}
