package one.digitalinnovation.digionebank

class Analista(
    nome: String,
    sobrenome: String,
    cpf: String,
    salario: Double): Funcionario(nome, sobrenome, cpf, salario)
{
    private val premium=0.2
    override fun calculaBeneficio() = salario * premium
}