/**********
 * Calculadora simples
 * Possui as seguintes operacoes
 * SOMA
 * SUBTRACAO
 * MULTIPLICACAO
 * DIVISAO
 ************/
import java.util.Scanner

fun main() {

    var num1: Float
    var num2: Float
    var result: Float
    var opcao: Int
    val input = Scanner(System.`in`)

    do {
        println("******** Menu Calculadora *********")
        println(" 1 - SOMA (+)")
        println(" 2 - SUBTRACAO (-)")
        println(" 3 - MULTIPLICACAO (*)")
        println(" 4 - DIVISAO (/)")
        println(" 5 - SAIR (-)")
        println("*********************************")
        println("Digite o numero da opcao desejada")

        opcao = input.nextInt()

        when(opcao){

            1 -> {
                println("Vamos realizar uma SOMA")
                println("Digite o primeiro numero")
                num1 = input.nextFloat()
                println("Digite o segundo numero")
                num2 = input.nextFloat()
                result = num1 + num2
                println("O resultado da SOMA: " + result)
            }
            2 -> {
                println("Vamos realizar uma SUBTRACAO")
                println("Digite o primeiro numero")
                num1 = input.nextFloat()
                println("Digite o segundo numero")
                num2 = input.nextFloat()
                result = num1 - num2
                println("O resultado da SUBTRACAO: " + result)
            }
            3 -> {
                println("Vamos realizar uma MULTIPLICACAO")
                println("Digite o primeiro numero")
                num1 = input.nextFloat()
                println("Digite o segundo numero")
                num2 = input.nextFloat()
                result = num1 * num2
                println("O resultado da MULTIPLICACAO: " + result)
            }
            4 -> {
                println("Vamos realizar uma DIVISAO")
                println("Digite o primeiro numero")
                num1 = input.nextFloat()
                println("Digite o segundo numero")
                num2 = input.nextFloat()
                result = num1 / num2
                println("O resultado da DIVISAO: " + result)
            }
            5 -> {
                println("Encerrando calculadora ...")
            }
            else -> {
                println("Algo deu errado!")
                println("Por Favor, digite uma opcao do MENU")
            }

        }

    }while(opcao != 5)

    println("OBRIGADA!")




}



