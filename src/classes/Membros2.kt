package classes

class Calculadora {
    private var resultado: Int = 0;

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach {
            resultado += it;
        };

        return this;
    }

    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor;
        return this;
    }

    fun limpar(): Calculadora {
        resultado = 0;
        return this;
    }

    fun print(): Calculadora {
        println(resultado);
        return this;
    }

    fun obterResultado(): Int {
        return resultado;
    }
}

fun main() {
    var calculadora = Calculadora();

    println(calculadora.somar(2, 10)
            .print()
            .multiplicar(5)
            .print()
            .limpar()
            .print()
            .obterResultado());
}