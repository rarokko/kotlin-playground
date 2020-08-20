package classes

class Filme {
    val nome: String;
    val anoLancamento: Int;
    val genero: String;

    constructor(nome: String, anoLancamento: Int, genero: String = "Aventura") {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }
}

fun main() {
    val filme = Filme("Filme Massa", 2007);
    println("${filme.nome} ${filme.anoLancamento} ${filme.genero}");
}