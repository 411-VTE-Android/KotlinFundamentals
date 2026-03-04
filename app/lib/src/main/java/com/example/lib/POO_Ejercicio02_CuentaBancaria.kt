package com.example.lib

class CuentaBancaria (val titular : String) {

    var saldo : Double = 0.0

    fun depositar (cantidad : Double) {
        saldo += cantidad
        println("Depósito de $$cantidad exitoso. Su nuevo saldo es de: $$saldo")
    }

    fun retirar (cantidad: Double) {
        if (cantidad <= saldo) {
            saldo -= cantidad
            println("Retiro de $$cantidad exitoso.  Su nuevo saldo es de: $$saldo")
        } else {
            println("Error: No cuenta con saldo suficiente para su retiro de $$cantidad. Su saldo actual es de: $$saldo")
        }
    }

    fun mostrarSaldo() {
        println("$titular, su saldo actual es de: $$saldo")
    }
}

fun main() {
    val cuenta = CuentaBancaria("María García")
    println("¡Bienvenida de nuevo ${cuenta.titular}!")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0)
    cuenta.mostrarSaldo()
}