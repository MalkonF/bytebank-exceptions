package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("início main")
    val entrada: String = "1.0"
    /*Para vc fazer um try com valores imutáveis vc pode usar o try com expressão.
    No caso vc podia declarar uma var fora do try e dentro do try vc atribuia o valor à ela, mas dessa forma não seria imutável.
    Aqui nesse caso ele tenta converter, se não der certo atribui null a var
    */
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }
    //if como expressão. Isso é feito pq Kotlin não trabalha com valores nulos
    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("Valor recebido: $valorComTaxa")
    } else {
        println("Valor inválido")
    }

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
