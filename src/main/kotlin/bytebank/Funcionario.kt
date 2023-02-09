package bytebank

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: String ?= null
) {
    abstract val bonificacao: Double
    override fun toString(): String {
        return "$tipo nome: $nome, cpf:$cpf, salario:$salario, bonificacao=${bonificacao}"
    }
}