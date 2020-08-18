package funcoes

fun <T> List<T>.secondOrNull(): T? = if (this.size >= 2) this.get(1) else null;

fun main() {
    val list = listOf("João", "Maria", "Pedro");
    print(list.secondOrNull());
}