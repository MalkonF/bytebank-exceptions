package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        e.printStackTrace()
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
    //Quando acontece uma exception, ela vai descendo a pilha de execução em cada método e vendo se nesses métodos
    //tem algum trecho que trata a exceção, se um não tratar, ela vai descendo os níveis. Se ngm tratar ela
    //estoura no main
}