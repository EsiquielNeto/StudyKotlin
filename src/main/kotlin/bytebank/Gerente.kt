package bytebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
    tipo = "Gerente"
) {
    override val bonificacao get() = super.bonificacao + salario

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

}