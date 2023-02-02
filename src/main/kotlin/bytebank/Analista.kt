package bytebank

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
    tipo = "Gerente"
) {
    override val bonificacao: Double
        get() {
            println("bonificação analista")
            return super.bonificacao + (salario * 0.1)
        }

}