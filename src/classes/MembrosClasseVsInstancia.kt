package classes

class ItemDePedido(val nome: String, val preco: Double) {

    companion object {
        @JvmStatic fun create(nome: String, preco: Double): ItemDePedido {
            return ItemDePedido(nome, preco);
        }

        @JvmStatic var desconto: Double = 0.0;
    }

    fun precoComDesconto(): Double {
        return preco - preco * desconto;
    }
}

fun main() {
    val item1 = ItemDePedido.create("TV 50 Polegadas", 2989.90);
    val item2 = ItemDePedido.create("Liquidificador", 299.00);

    ItemDePedido.desconto = 0.10;

    println(item1.precoComDesconto());
    println(item2.precoComDesconto());
}