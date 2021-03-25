package one.digitalinnovation.digionebank

fun main() {

    //Banco
    val digiOneBank = Banco("DigiOneBank", 1007)
    println(digiOneBank.info())
    println("==================================")

    //Analista
    val analistatest= Analista("Ana", "Vilela", "012.345.678-98", 2000.00)
    printReport(analistatest)
    println("==================================")

    //Gerente
    val gerenteTest= Gerente("Barbara", "da Silva", "098.765.432-10", 4000.00, "gerente123")
    printReport(gerenteTest)
    authenticate(gerenteTest)
    println("==================================")

    //Cliente
    val clienteTest = Cliente("Ana", "Ferrari", "987.654.321-01", ClienteTipo.PF, "cliente123")
    println(clienteTest)
    authenticate(clienteTest)
    println("==================================")

    //Cliente tipo
    ClienteTipo.values().forEach { element -> println("${element.name} + ${element.description}") }
    ClienteTipo.values().forEach { it:ClienteTipo -> println("${it.name} + ${it.description}") }

    val pf=ClienteTipo.PF
    println("${pf.name} >> ${pf.description} ")

    val pj = ClienteTipo.PJ
    println("${pj.name} >> ${pj.description}")
    println("==================================")
}
//Login
fun authenticate(loggable:Loggable)=println(loggable.loggin())