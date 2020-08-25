package collections

fun main() {
    var numeros = Array<Int>(10) { i -> i * 10 };

    for(numero in numeros) {
        println(numero);
    };

    println(numeros.get(1));
    println(numeros[1]);
    println(numeros.size);

    numeros.set(1, 1234);
    numeros[1] = 4321;

}