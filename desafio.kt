// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario (val username: String, val matricula: Int)

data class ConteudoEducacional(val id: Int, val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun addUsuario(){
        for(usuario in inscritos){
            println("nome: ${usuario.username}")
        }
    }

    fun listarInscritos() {
        inscritos.forEach { u -> println("Nome: ${u.username} - Matrícula: ${u.matricula}") }
    }

    fun printConteudoEducacional(){
        for(cont in conteudos){
            println("id: ${cont.id} - ${cont.nome} - ${cont.duracao}min - (${cont.nivel})")
        }

    }
}

fun main() {
    val kotlinExperience = listOf(ConteudoEducacional((10..99).random(),"Conteúdo Educacional Exemplo - Módulo 1", 60, Nivel.BASICO),
        ConteudoEducacional((10..99).random(),"Conteúdo Educacional Exemplo - Módulo 2", 120, Nivel.INTERMEDIARIO))

    val formacaoKotlin = Formacao("Kotlin Experience", kotlinExperience, )

    formacaoKotlin.matricular(Usuario("João da Silva", (1000..9999).random()))
    formacaoKotlin.listarInscritos()
    formacaoKotlin.printConteudoEducacional()

}