package com.example.lib

//Principio  de POO (Programación Orientada a Objetos)
/*
+/A pie
Herencia
Polimorfismo
Encapsulamiento
Abstracción
 */

class Person(val name : String, val age : Int) {
    fun sayHello() {
        println("Hola, soy $name y tengo $age")
    }
}

//Abstracción: Se modela solo lo importante
//La diferencia entre una clase normal y una abstracta, es que las abstractas NO pueden
//instanciar objetos.

/*
* Los métodos en Kotlin se definen con FUN
* Para regresar un dato, se utiliza: Tipo de dato
* */
abstract class Shape{
    abstract fun calculateArea() : Double
}

class Circle(val radius : Double) : Shape(){
    override fun calculateArea(): Double {
        return radius * radius * Math.PI
    }
}

class Square(val side : Double) : Shape(){
    override fun calculateArea(): Double {
        return side * side
    }
}

//Interface
/*
* Una interfaz es un contraro
* */
interface Ave {
    fun fly()
    fun poop()
    fun peep()
    fun coititoRico()
}

class Eagle : Ave {
    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun poop() {
        TODO("Not yet implemented")
    }

    override fun peep() {
        TODO("Not yet implemented")
    }

    override fun coititoRico() {
        TODO("Not yet implemented")
    }
}

open class Animal(val name : String) {
    open fun makeSound() {
        println("$name está haciendo un sonido")
    }
}

class Dog : Animal(name = "Solovino") {

}

class Cat(val catName : String) : Animal(name = catName){
    fun trepar(stairs : Int, place: String) {
        println("$name trepo $stairs escalones en $place")
    }
}

fun main() {
    val persona = Person(name="Victor Tavares", age = 19)
    val persona2 = Person(age = 19, name = "Victor Tovares")
    val animal = Animal("Animal generico")
    val cat = Cat("Coco")
    cat.trepar(3,"La Salle")
    persona.sayHello()
    persona2.sayHello()
    println("El nombre de la persona 1 es ${persona.name}")

    val square1 = Square(side = 34.5)
    val square2 = Square(side = 12.3)
    val circle = Circle(radius = 10.0)
    val shapes = listOf<Shape>(square1, square2, circle)
    for(shape in shapes){
        println(shape.calculateArea())
    }
}