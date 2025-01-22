data class Contacto(val nombre: String, val telefono: Int, val id: Int)

class Agenda(){
    private val contactos = mutableListOf<Contacto>()

    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        println("Contacto agregado: ${contacto.nombre}")
    }
    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("La agenda está vacía.")
        } else {
            println("Contactos en la agenda:")
            contactos.forEach { println("Nombre: ${it.nombre}, Teléfono: ${it.telefono}") }
        }
    }
    fun buscarContacto(nombre: String){
        val resultado = contactos.filter{it.nombre.contains(nombre, ignoreCase = true)}
        if (resultado.isEmpty()){
            println("No se ha encontrado ese contacto de nombre: $nombre")
        }else{
            println("Contacto encontrado")
            resultado.forEach{ println("Nombre: ${it.nombre}, Telefono: ${it.telefono}") }
        }
    }
}

fun main(){
    val agenda = Agenda()

    while (true) {
        println("Agenda")
        println("1. Añadir contacto")
        println("2. Listar contactos")
        println("3. Buscar contactos")
        println("4. Existe contacto")
        println("5. Eliminar contacto")
        println("6. Contactos disponibles")
        println("7. Agenda llena")
        println("8. Salir")
        println("Escribe una de las opciones")

        when(readLine()?.toIntOrNull()){
            1-> {
                println("Añade el nombre del contacto")
                val nombre = readLine()?: ""
                println("Añade el número de teléfono")
                val telefono = readLine()?:""
                agenda.agregarContacto(Contacto(nombre, telefono))
            }
            2-> agenda.listarContactos()
            3-> {
                println("Añade el nombre a buscar")
                val nombre = readLine()?:""
                agenda.buscarContacto(nombre)
            }
            4-> {

            }
        }
    }
}