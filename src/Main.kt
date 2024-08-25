fun main() {

    val nome: String = "Rudy"
    var idade: Int = 28
    var salario: Double = 5000.00
    var mesesTrabalho: Int = 12
    var produtosCoprados: Int = 1000
    var valorVendidosProduto: Double = 46458.00


    fun salAnualB(a: Double = salario, b: Int = mesesTrabalho): Double {    //salario anual bruto
        return a * b
    }

    fun salAnualL(a: Double = salAnualB()): Double {    //salario anual liquido
        return a * 0.9
    }

    fun valMedProduto(a: Double = valorVendidosProduto, b: Int = produtosCoprados  ): Double {
        return a / b
    }

    fun saudacao(nome: String) {
        println("Olá, $nome! seu sálairo anual líquido é ${salAnualL()}")
    }


    println(saudacao(nome))
    println("Idade: $idade")
    println("Salario: $salario")
    println("Meses trabalhados: $mesesTrabalho")
    println("valorVendidosProdutos: $valorVendidosProduto")
    println("Produtos comprados: $produtosCoprados")
    println("Valor vendido: $valorVendidosProduto")
    println("Salario Anual Bruto: ${salAnualB()}")
    println("Salario Anual Líquido: ${salAnualL()}")
    println("Valer medio por produto: ${valMedProduto()}")

}