package br.com.alura.bytebank.teste

public fun testaExpressao() {
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
}