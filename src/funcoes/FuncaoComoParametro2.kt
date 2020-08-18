package funcoes

fun <T> filtrar(lista: List<T>, filtro: (T) -> Boolean): List<T> {
    val listaFiltrada = ArrayList<T>();

    for (e in lista) {
        if (filtro(e)) {
            listaFiltrada.add(e);
        }
    }

    return listaFiltrada;
}

fun comTresLetras(nome: String): Boolean {
    return nome.length == 3;
}

fun main() {
    val nomes = listOf("Ana", "Pedro", "Bia", "Gui", "Rebeca");
    println(filtrar(nomes, ::comTresLetras));
}