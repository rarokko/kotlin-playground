package oo.heranca

fun main() {
    val carro = Ferrari();
    carro.acelerar();
    println(carro.toString());
    carro.ligarTurbo();
    carro.acelerar();
    println(carro.toString());
    carro.frear();
    println(carro.toString());
}