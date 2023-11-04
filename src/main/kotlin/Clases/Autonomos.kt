package Clases

class Autonomos(nombre: String, apellidos: String, dni: String, var sueldo: Int, var contratado: Boolean? = true) :
    Trabajadores(nombre, apellidos, dni) {


    override fun mostrarDatos(): String {

//        super.mostrarDatos()
        return "Nombre: $nombre Apellidos: $apellidos DNI: $dni, Sueldo: $sueldo, Contratado: $contratado"
//        print("$contratado" ?: "No contratado")


    }

}