package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    var endereco: Endereco? = null // ? permite receber nulo
    endereco!!.logradouro //Ele pega a var que pode ser nulo graças ao sinal de ? acima e
    // transforma em um tipo que não pode ser nulo. Então a gente vai assumir que isso é um obj valido
    //que não é nulo, é nossa responsabilidade porque se rodar e estiver nulo vai dar a Exceção KotlinNullPoin..
    var enderecoNaoNulo: Endereco = endereco!!//atribuindo ref da var endereco e configurando p aceitar nulo
    enderecoNaoNulo.logradouro
}







