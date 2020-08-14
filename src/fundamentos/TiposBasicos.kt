package fundamentos

fun main() {
    // Tipos númericos inteiros
    val num1: Byte = 127;
    val num2: Short = 32767;
    val num3: Int = 2_147_483_647;
    val num4: Long = 9223372036854775807;

    // Tipos númericos reais
    val num5: Float = 3.14F;
    val num6: Double = 3.14;

    // Tipo caractere
    val char: Char = '?';

    // Tipo booleano
    val boolean: Boolean = true;

    println(listOf(num1, num2, num3, num4, num5,  num6, char, boolean))

    println(2 is Int);
    println(2147483648 is Long);
    println(1.0 is Double);
}