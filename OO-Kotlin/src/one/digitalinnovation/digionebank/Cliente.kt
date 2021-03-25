package one.digitalinnovation.digionebank

class Cliente (
    nome: String,
    sobrenome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val password: String): Pessoa(nome, sobrenome, cpf), Loggable
{
    override fun loggin(): Boolean = "cliente123" == password
    override fun toString(): String = """
        Nome = $nome
        Sobrenome = $sobrenome
        CPF = $cpf
        Tipo = ${clienteTipo.description}
        """.trimIndent()

}