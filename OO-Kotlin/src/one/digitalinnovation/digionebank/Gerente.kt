package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    sobrenome: String,
    cpf: String,
    salario: Double,
    val password: String): Funcionario(nome, sobrenome, cpf, salario), Loggable
{
    private val premium = 0.4
    override fun calculaBeneficio() = salario * premium
    override fun loggin(): Boolean = "gerente123" == password
}