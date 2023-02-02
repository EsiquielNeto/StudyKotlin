package bytebank

open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: String
) {
    open val bonificacao get() = salario * 0.1
    override fun toString(): String {
        return "$tipo nome: $nome, cpf:$cpf, salario:$salario, bonificacao=${bonificacao}"
    }
}