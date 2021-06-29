package br.com.alura.bytebank.exception

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticação"
) : Exception(mensagem) // Manda mensagem para superclasse Exception estendendo ela