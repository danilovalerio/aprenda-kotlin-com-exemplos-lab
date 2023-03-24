package desafio

fun main() {
    println("Iniciar programa...")


    val usuarios = listOf(
        Usuario("Marciano"),
        Usuario("Luizeto"),
        Usuario("Arturo")
    )

    val conteudosEducacionais = mutableListOf(
        ConteudoEducacional("lógica de programação"),
        ConteudoEducacional("floxograma e a programação"),
        ConteudoEducacional("pseudocódigo"),
        ConteudoEducacional("entendendo variáveis"),
    )

    val formacao1 = Formacao("Introdução a Programação", Nivel.BASICO, conteudosEducacionais)

    /*Exibe usuários criados
    println("--------Usuários--------")
    usuarios.forEach {
        println("Usuário: id: ${it.id} - ${it.nome}")
    }

    println("--------Conteúdos Educacionais--------")
    conteudosEducacionais.forEach {
        println("${it.titulo}")
    }*/

    exibeFormacao(formacao1)
    exibeAlunos(formacao1)
    //Matricula Marciano
    formacao1.matricular(usuarios[0])
    exibeAlunos(formacao1)
    //Matricular mais de um usuario por vez
    formacao1.matricular(mutableListOf(usuarios[1], usuarios[2]))
    exibeAlunos(formacao1)
    //remover arturo
    formacao1.removerInscrito(usuarios[2])
    exibeAlunos(formacao1)
}

fun exibeAlunos(formacao: Formacao) {
    println("Alunos inscritos nessa formação:")
    if (formacao.inscritos.size > 0) {
        formacao.inscritos.forEach {
            println("${it.id} - ${it.nome}")
        }
    } else {
        println("Nenhum inscrito ainda nessa formação...")
    }
    println()
}

fun exibeFormacao(formacao: Formacao) {
    println("--------FORMAÇÕES--------")
    println("Formação: ${formacao.titulo}")
    println("CONTEÚDOS DESSA FORMAÇÃO:")

    if ((formacao.conteudosEducacionais?.size ?: 0) > 0) {
        formacao.conteudosEducacionais?.forEach {
            println("- ${it.titulo}")
        }
    } else {
        println("Nenhum conteúdo ainda cadastrado...\n\n")
    }
    println()
}