// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
	//TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("Matrícula realizada para ${usuario.nome} na formação $nome.")
    }
}

fun main() {
     //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    // Cenários de teste

    // Criando alguns usuários
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")

    // Criando alguns conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 120)

    // Criando uma formação
    val formacao = Formacao("Desenvolvimento de Software")

    // Adicionando conteúdos à formação
    formacao.conteudos.add(conteudo1)
    formacao.conteudos.add(conteudo2)

    // Matriculando usuários na formação
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Imprimindo informações sobre a formação
    println("Formação: ${formacao.nome}")
    println("Conteúdos: ${formacao.conteudos.joinToString { it.nome }}")
    println("Inscritos: ${formacao.inscritos.joinToString { it.nome }}")
}
