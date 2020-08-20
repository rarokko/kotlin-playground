package classes

enum class DiaSemana2(val id: Int, val nome: String, val util: Boolean) {
    DOMINGO(1, "Domingo", false),
    SEGUNDA(1, "Segunda", true),
    TERCA(1, "Terca", true),
    QUARTA(1, "Quarta", true),
    QUINTA(1, "Quinta", true),
    SEXTA(1, "Sexta", true),
    SABADO(1, "Sabado", false)
}

fun main() {
    for (dia in DiaSemana2.values()) {
        println("${dia.nome} é um dia ${if (dia.util) "útil" else "não útil"}");
    };
}