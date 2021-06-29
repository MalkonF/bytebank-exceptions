package br.com.alura.bytebank.exception

//aqui nao é possível fazer Exception(message = "Saldo insuficiente") porque é uma classe herdada de Java
class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente"
) : Exception(mensagem)