package one.digitalinnovation.digionebank

data class Banco (
    val name: String,
    val number: Int
)
{
    fun info() = """
        Nome: $name  
        Numero: $number 
        """.trimIndent()
}