package bytebank

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
    tipo = "Diretor"
) {
    override val bonificacao get() = super.bonificacao + salario + plr
}