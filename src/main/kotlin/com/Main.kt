package com

fun main() {
    val name: String? = null // nullable 타입
    println(name?.length ?: "Name is null") // 안전한 호출 연산자와 엘비스 연산자 사용

    val person:Person = Person(Arm(Hand()), Arm(null))
    person?.leftArm?.hand?.grab();     // 코틀린에서는 안전하게 함수 호출하려면 이렇게만 해도 됩니다
}

class Person (val leftArm: Arm?, rightArm: Arm?) {
}

class Arm (val hand: Hand?) {
}

class Hand {
    fun grab() {
        println("Hand is grabbing")
    }
}