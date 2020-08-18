package funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray {
    return numeros.sortedArray();
}

fun main() {
    for(n in ordenar(38, 3, 431, 321, 312, 321, 5, 6, a = 1)) {
        println(n);
    };
}