package classes

val diretamenteNoArquivo = "Bom dia";

fun topLevel() {
    val local = "Fulano";
    println(diretamenteNoArquivo);
    println(local);
}

class Coisa {
    var variavelDeInstancia: String = "Variavel de classe";

    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano";
    }

    fun fazer() {
        val local: Int = 7;

        if (local > 3) {
            val variavelDeBloco = "Beltrano";
            println("$variavelDeInstancia, $variavelDeBloco, $constanteDeClasse");
        }
    }
}

fun main() {
    topLevel();
    Coisa().fazer();
    println(Coisa.constanteDeClasse);
}