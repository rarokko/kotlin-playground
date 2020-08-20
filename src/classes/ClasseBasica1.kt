package classes

class Cliente {

    var nome: String = "";

}

fun main() {
    val cliente = Cliente();
    cliente.nome = "João";
    println("Meu cliente é ${cliente.nome}");
}