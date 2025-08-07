package com

fun String.greet(): String {
    return "Hello, $this!"
}

fun String.greet2(): String {
    return "Nice to meet you, $this!"
}

fun main() {
    println("Alice".greet()) // 확장 함수 사용
    println("Bob".greet2())  // 또 다른 확장 함수 사용
}