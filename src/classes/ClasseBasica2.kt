package classes

class Pessoa1(var nome: String);
class Pessoa2(val nome: String);
class Pessoa3(nomeInicial: String) {
    val nome: String = nomeInicial;
};

fun main() {
    val p1 = Pessoa1("João");
    p1.nome = "Guilherme";
    println(p1.nome);

    val p2 = Pessoa2("Maria");
    println(p2.nome);

    val p3 = Pessoa3("Pedro");
    println(p3.nome);
}