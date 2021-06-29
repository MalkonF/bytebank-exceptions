package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    var enderecoNulo: Endereco? = null // ?(safe call) permite receber nulo
    print(enderecoNulo?.logradouro)
    var enderecoNulo2: Endereco? = Endereco(logradouro = "Rua Vergueiro")
    var logradouroNovo: String? = enderecoNulo?.logradouro
    println(enderecoNulo?.logradouro?.length?.toUByte())//sempre para acessar tem que usar o safe call
    //porque a var enderecoNulo foi decalradac om ? e null
    //Só quando vc usa o let vc pode usar sem safe call uma declaração que foi feita com safe call
    enderecoNulo?.let {
        println(it.logradouro.length)
    }
}







