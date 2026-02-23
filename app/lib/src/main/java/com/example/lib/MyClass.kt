package com.example.lib

/*
* 1. Crea un programa, que tenga un precio de comida y un porcentaje de propina.
*       +Imprimir cuanto es el total a pagar
* */

//String interpolation
fun main() {
    println("Hola mundo")
    // 1.
    val price : Double = 150.0
    val percentage : Double = 0.10
    val tip : Double = price * percentage
    val total : Double = price + tip
    println("El precio de la comida es: $$total")


    //El portero de la discoteca. Verifica que una persona pueda entrar en la disco.
    //Solo si es mayor de edad
    println("Pon una edad")
    val input  = readlnOrNull()
    val age = input?.toIntOrNull()
    println("La edad es: $age")

//    if(age == null){
//        println("El numero que pusiste no es un numero entero")
//    }
//    else if(age > 18){
//        println("Eres mayor de edad")
//    }
//    else(){
//        println("No puedes pasar")
//    }

    when(age) {
        in 1..17 -> println("No puedes pasar")
        null -> println("El numero que pusiste no es un numero entero")
        //in 18 .. Integer.MAX_VALUE -> println("Puedes pasar") [18 a infinito]
        else -> println("Puedes pasar")

    }

    for (i in 1..10){
        println(i)
    }

    //Ciclo for al reves
    for (i in 10 downTo 2){
        println(i)
    }

    //Ciclo for de 10 en 10
    for (i in 100 downTo 0 step 10){
        println(i)
    }

    var counter : Int = 12
    while(counter < 20){
        println("El contador es menor que 20")
        counter++
    }

    //DO WHILE ejecuta primero el bloque de codigo y despues evalua la condicion

    do {
        println("El contador vale menos que 30")
        counter++
    }
        while (counter<30)

//Operadores logicos: && ||
// Operadores aritmeticos: + - = / %

////Numero primo
//val nume = readlnOrNull()
}





