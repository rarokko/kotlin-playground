package collections

fun main() {
    var map = HashMap<Long, String>();

    map.put(10020030040, "João");
    map.put(10020030041, "Maria");
    map.put(10020030042, "Pedro");

    map.put(10020030042, "Pedro Filho");

    for (par in map) {
        par.print();
        par.key.print();
        par.value.print();
    };

    for (par in map.entries) {
        par.print();
        par.key.print();
        par.value.print();
    };

    for (nome in map.values) {
        nome.print();
    };

    for (cpf in map.keys) {
        cpf.print();
    };

    for ((cpf, nome) in map) {
        println("$nome - $cpf");
    };

    map.size.print();
    map.get(10020030040)?.print();
    map[10020030040]?.print();
    map.contains(10020030040).print();
    map.remove(10020030040)?.print();
    map.contains(10020030040).print();
    map.clear();
    map.isEmpty().print();
}