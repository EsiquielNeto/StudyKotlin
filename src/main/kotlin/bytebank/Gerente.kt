package bytebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
    tipo = "Gerente"
) {
    override val bonificacao: Double
        get() {
            println("bonificação gerente")
            return salario + 0.4
        }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

}