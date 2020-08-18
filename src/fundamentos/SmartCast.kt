package fundamentos

fun main() {
    souEsperto("abc");
    souEsperto(1);
    souEsperto(true);
    souEsperto2("abc");
    souEsperto2(1);
    souEsperto2(true);
}

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.toUpperCase());
    } else if (x is Int) {
        println(x.plus(3));
    } else {
        println("Valor inválido");
    }
}

fun souEsperto2(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase());
        is Int -> println(x.plus(3));
        else -> println("Valor inválido");
    }
}