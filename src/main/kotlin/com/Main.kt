package com

data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Alice", 30)
    println(person1) // 자동 생성된 toString() 사용

    val person2 = Person("Alice", 30)
    println(person1 == person2) // 자동 생성된 equals() 사용
}