package desafio

class Usuario(val nome: String) {
    val id = geraId()

    private fun geraId(): Long {
        Thread.sleep(1)
        return System.currentTimeMillis()
    }
}

