package funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado(a) à $chefe.";
}

fun main() {
    println(relacaoDeTrabalho("Gabriel", "Joãozinho"));
    println(relacaoDeTrabalho(funcionario = "Joãozinho", chefe = "Gabriel"));
}