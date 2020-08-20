package classes

//data class implementa equals de dados, tostring mais organizado, copy

class Geladeira(val marca: String, val litros: Int);
data class Televisao(val marca: String, val polegadas: Int);

fun main() {
    val g1 = Geladeira("Brastemp", 320);
    val g2 = Geladeira("Brastemp", 320);

    val t1 = Televisao("Samsung", 32);
    val t2 = Televisao("Samsung", 32);

    println(g1 == g2);
    println(t1 == t2);

    println(g1.toString());
    println(t1.toString());

    println(t1.copy(polegadas = 42));

    //Destructuring apenas em data class
    val (marca, pol) = t1;
    println("$marca $pol");
}