package one.digitalinnovation.digionebank

abstract class Funcionario(
    nome: String,
    sobrenome: String,
    cpf: String,
    val salario:Double): Pessoa(nome, sobrenome, cpf)
{
    protected abstract fun calculaBeneficio(): Double
    override fun toString(): String = """
        Nome = $nome
        Sobrenome = $sobrenome
        CPF = $cpf
        Salario = $salario
        Beneficio = ${calculaBeneficio()}
        """.trimIndent()

}

fun printReport(funcionario: Funcionario) = println(funcionario.toString())