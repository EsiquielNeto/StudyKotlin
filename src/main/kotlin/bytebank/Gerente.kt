package bytebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao get() = salario * 0.2

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

    override fun toString(): String {
        return "Gerente(nome='$nome', cpf='$cpf', salario=$salario, bonificacao=${bonificacao})"
    }


}