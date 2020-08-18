package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("abrir transação..");

    try {
        funcao();
    } finally {
        println("fechar transação..");
    }
}

fun main() {
    transacao {
        println("Executando função");
    };

    transacao({
        println("Executando função");
    });
}