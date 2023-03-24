package desafio

class Formacao(
    val titulo: String,
    val nivel: Nivel,
    val conteudosEducacionais: MutableList<ConteudoEducacional>? = mutableListOf(),
    inscritos: MutableList<Usuario>? = mutableListOf<Usuario>()
) {
    private val conteudos: MutableList<ConteudoEducacional> = conteudosEducacionais ?: mutableListOf()
    val inscritos: MutableList<Usuario> = inscritos ?: mutableListOf<Usuario>()

    fun adicionarConteudoEducaciona(educacional: ConteudoEducacional) {
        this.conteudos.add(educacional)
    }

    fun matricular(usuario: Usuario) {
        this.inscritos.add(usuario)
    }

    fun matricular(usuarios: MutableList<Usuario>) {
        if (usuarios.size > 0) {
            usuarios.forEach { inscritos.add(it) }
        }
    }

    fun removerInscrito(usuario: Usuario) {
        val index = this.inscritos.indexOf(usuario)
        this.inscritos.removeAt(index)
    }

}
