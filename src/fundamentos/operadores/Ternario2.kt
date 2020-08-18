package fundamentos.operadores

fun main() {
    println(obterResultado(7.5));
}

fun obterResultado(nota: Double) : String = if (nota >= 7.0) "Aprovado" else "Reprovado"