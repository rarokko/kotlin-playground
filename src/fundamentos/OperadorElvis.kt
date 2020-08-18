package fundamentos

fun main() {
    val opcional: String? = null;
    val obrigatoria: String = opcional ?: "Valor padrão"

    println(obrigatoria);
}