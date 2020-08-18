package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    val ( marca, modelo ) = Carro("Ford", "Ka"); //não precisa ser nome exato, é por index
    println("$marca $modelo");

    val (marido, mulher) = listOf("Gabriel", "Gabrielle");
    println("$marido e $mulher");

    val (_, _, terceiroLugar) = listOf("1", "2", "3");
    println("$terceiroLugar");
}