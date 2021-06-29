package br.com.alura.bytebank.exception

//aqui nao é possível fazer Exception(message = "Saldo insuficiente") porque é uma classe herdada de Java
class SaldoInsuficienteException : Exception("O saldo é insuficiente")