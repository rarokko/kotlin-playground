package classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String);

fun main() {
    val filme = Filme2("Filme Novo", 2007, "Drama");
    println("${filme.nome} ${filme.anoLancamento} ${filme.genero}");
}