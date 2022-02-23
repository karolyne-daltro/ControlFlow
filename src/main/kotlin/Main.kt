fun main() {
    //Controle de fluxo
    /*
    Operadores Relacionais
    ==        !=
    >         <=
    <         >=

    Operadores Lógicos
    E - &&      OU - ||

    Tabela Verdade

    &&               ||
    VV - V         VV - V
    FV - F         FV - V
    VF - F         VF - V
    FF - F         FF - F

    if..else else..if

    if(condicao){

    Executar um bloco de código se a condição for verdadeira

    }else if(condicao){

    Executar um bloco de código se a condição for falsa

    }eslse{

    Executar um bloco de código se nenhuma das condições forem verdadeiras

    }

     */

    //Compras de 50 para cima - 10%
    //Compras de 100 para cime - 30%
    //Compras de 200 para cima - 50%

    //Exemplo else

    /*print("Digite o valor da sua compra: ")
    val valor = readLine()!!.toDouble()

    var porc = 0.0

    if (valor < 50){
        porc = 0.0
    }else if (valor >= 50 && valor < 100){
        porc = 0.1
    }else if (valor >= 100 && valor < 200){
        porc = 0.3
    }else{
        porc = 0.5
    }

    val desc = valor * porc

    println("Com a sua compra, você terá um deconto de ${porc * 100}%,"+
            "resultando em R$$desc")
    */


    /*
    when -  quando

    when(valor){

    1 -> println("sou o valor 1")
    2 -> println("Sou o valor 2")
    50 -> println("Sou o valor 50")

    }
     */
    //readLine() - Sempre retorna uma String

    //Exemplos simples When

    /*println("Digite um valor de 1 até 4:")
    val num = readLine()!!.toInt()

    when(num){

        1-> println("Verão")
        2-> println("Outono")
        3-> println("Inverno")
        4-> println("Primavera")
        else -> println("Valor Incorreto!")

    }*/

    //Exenplo When range simples
    /*
    println("Digite o mês para verificarmos em qual estação do ano" +
    "ele se encontra: ")

    val mes = readLine()!!.toInt()

    //Janeiro a Março - 1 até 3 Verão
    //Abril a Junho - 4 até 6 Outono
    //Julho a Setembro - 7 até 9 Inverno
    //Outubro a Dezembro - 10 até 12 Primavera

    when(mes){

        //Range - Intervalo entre valores (valor1..valor2)
        in 1..3 -> println("Verão")
        in 4..6 -> println("Outono")
        in 7..9 -> println("Inverno")
        in 10..12 -> println("Primavera")
        else -> println("Mês Inválido")
    }
    println("Digite o número do mês para verificarmos em qual estação do ano" +
            " ele se encontra: ")

    val mes = readLine()!!.toInt()

    println("Digite a temperatura:  ")

    val temp = readLine()!!.toDouble()

    when(mes){

        in 1..3 -> {
            println("Estamos no verão")
            if (temp > 30.0){
                print("Beba água")
        }else{
            println("O clima está agradável")
            }
        }
        in 4..6 ->{
            println("Estamos no Outono")
            if (temp > 28.0){
                print("Muito calor para o Outono! Beba água.")
            }else if(temp in 20.0..28.0){
                println("O clima está agradável")
            }else{
                println("Está muito frio")
            }
        }

        in 7..9 ->{
            println("Estamos no Inverno")
            if (temp > 7.0){
                print("Muito frio! Beba água.")
            }else if(temp in 7.0..18.0){
                println("O clima está um pouco frio")
            }else{
                println("Está muito frio")
            }
        }
        in 10..12 -> {

        println("Estamos no Primavera")
            if (temp > 19.0){
            print("Muito frio! Beba água.")
        }else if(temp in 19.0..30.0){
        println("O clima está agradável")
    }else{
        println("Está muito frio")}

        } else -> println("Mês Inválido")

    }*/

    /* Faça um programa que o usuário digite um número e o
       programa retorne o mês referente ao valor.

    print("Digite um número: ")

    val mes = readLine()!!.toInt()

    when(mes){
         1 -> println("Estamos no mês de Janeiro")
         2 -> println("Estamos no mês de Fevereiro")
         3 -> println("Estamos no mês de Março")
         4 -> println("Estamos no mês de Abril")
         5 -> println("Estamos no mês de Maio")
         6 -> println("Estamos no mês de Junho")
         7 -> println("Estamos no mês de Julho")
         8 -> println("Estamos no mês de Agosto")
         9 -> println("Estamos no mês de Setembro")
        10 -> println("Estamos no mês de Outubro")
        11 -> println("Estamos no mês de Novembro")
        12 -> println("Estamos no mês de Dezembro")

        else -> println("Mês inválido!")
    }*/

    /*Faça um programa que receba a idade de uma pessoa e mostre na saída
    em qual categoria ela se encontra:
            10-14 infantil
            15-17 juvenil
            18-25 adulto*/

    print("Digite a idade da pessoa: ")

    val idade = readLine()!!.toInt()


    when(idade){

    in 10..14 -> println("Essa idade está na categoria infantil.")
    in 15..17 -> println("Essa idade está na categoria juvenil")
    in 18..25 -> println("Essa idade está na categoria adulto")

        else -> println("Essa idade não faz parte de nehuma categoria!")
    }










}




