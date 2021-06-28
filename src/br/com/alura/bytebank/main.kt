package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("início main")
    try {
        10 / 0
    } catch (e: ArithmeticException) {
        println("Peguei exceção")
    }
    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        try {
            endereco as Endereco //se na JVM não tiver alguma classe que trate essa exceção ela vai estourar no console
        } catch (e: ClassCastException) {
           // println(e.message)
            //println(e.stackTrace)
            //println(e.cause)
            e.printStackTrace() //reune as 3 info dos println acima
            println("Peguei exceção")
        }
    }
    println("fim funcao2")
    //Quando acontece uma exception, ela vai descendo a pilha de execução em cada método e vendo se nesses métodos
    //tem algum trecho que trata a exceção, se um não tratar, ela vai descendo os níveis. Se ngm tratar ela
    //estoura no main
}
