package com.example.lib

fun main() {
    val numbers = listOf<Int>(32,312,42,321,32,12,4,5)
    var maxNumber = numbers[0]
    for(number in numbers) {
        if(number > maxNumber) {
            maxNumber = number
        }
        println(number)
    }
}