package collections

class Objeto(val nome: String, val descricao: String) {
    override fun hashCode(): Int {
        return nome.length
    };

    override fun equals(other: Any?): Boolean {
        if (other is Objeto) {
            return nome.equals(other.nome, ignoreCase = true);
        };

        return false;
    }
}

fun main() {
    val conjunto = hashSetOf(
        Objeto("Cadeira", "..."), //hashcode 7
        Objeto("Mesa", "..."), //hashcode 4
        Objeto("Faca", "..."), //hashcode 4
        Objeto("Copo", "...") ///hashcode 4
    );

    conjunto.contains(Objeto("faca", "???")).print();
}