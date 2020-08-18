package funcoes

fun incremento(num: Int): Int {
    //errado: num++;
    return num + 1;
}

fun main() {
    println(incremento(3));
}