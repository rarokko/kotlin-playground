package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {

    fun formatar(): String {
        return "$dia/$mes/$ano";
    }
}

fun main() {
    var nascimento: Data = Data(28, 10, 1992);
    println(nascimento.formatar());
}