package funcoes

import java.util.*

data class Horario(val hora: Int, val minuto: Int, val segundo: Int)

fun agora(): Horario {
    val agora = Calendar.getInstance();

    //referencia os gets dentro do bloco para ser do objeto parametro
    with(agora) {
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND));
    };
}

fun main() {
    val ( h, m, s ) = agora();
    println("$h:$m:$s");
}