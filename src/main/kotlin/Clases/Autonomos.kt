package Clases

class Autonomos(nombre: String, apellidos: String, dni: String, var sueldo: Int, var contratado: Boolean? = null) :
    Trabajadores(nombre, apellidos, dni) {


    override fun mostrarDatos() {

        super.mostrarDatos()
        print("$sueldo ")
        print("$contratado" ?: "No contratado")


    }

}