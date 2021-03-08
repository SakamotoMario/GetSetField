class Maquina (var marca: String) {

    var nucleo: Int = 0
        get() {
            println("Get foi chamado")
            return field
        }
        set(value) {
            println("set foi chamado")
            field = value
        }

}

fun main() {
    var m = Maquina ("xpto")
    println(m.nucleo)
        m.nucleo = 10
}