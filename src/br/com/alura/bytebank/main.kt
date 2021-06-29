package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    var enderecoNulo: Endereco? = null // ?(safe call) permite receber nulo
    println("t" + enderecoNulo?.logradouro)
    var enderecoNulo2: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "predio")
    var logradouroNovo: String? = enderecoNulo?.logradouro
    println("e" + enderecoNulo?.logradouro?.length?.toUByte())//sempre para acessar tem que usar o safe call
    //porque a var enderecoNulo foi decalradac om ? e null
    //Só quando vc usa o let vc pode usar sem safe call uma declaração que foi feita com safe call
    enderecoNulo2?.let {
        println("ex" + it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: 0 //elvis operator devolve 0 caso seja vazio ou o length caso n seja nulo
        println(tamanhoComplemento)
    }

    teste(1)
}

//se der erro na conversão, por exemplo, se colocar string no lugar de int em teste() ele vai atribuir nulo
//ao invés de dar exception
fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    print(numero)

}







