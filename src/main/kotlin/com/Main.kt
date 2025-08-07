package com

fun main() {
    val ages = mapOf(
        "Alice" to 30,
        "Bob" to 25,
        "Charlie" to 35
    )

    for ((name, age) in ages) {
        println("$name is $age years old.")
    }
}