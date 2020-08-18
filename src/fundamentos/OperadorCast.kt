package fundamentos

fun imprimirConceito(nota: Any) {
    when(nota as? Int ?: 0) {
        10,9 -> println("A");
        8,7 -> println("B");
        6,5 -> println("C");
        4,3 -> println("D");
        2,1,0 -> println("E")
        else -> println("Nota inválida");
    }
}

fun main() {
    val notas = arrayOf(10, 2, 3, 4, 6, 7, 11, 2.0);
    for (nota in notas) {
        imprimirConceito(nota);
    }
}