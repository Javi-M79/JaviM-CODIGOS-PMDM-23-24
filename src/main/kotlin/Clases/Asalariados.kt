package Clases


/*
En el contructor de esta clase introducimos de nuevo todos los datos e indicamos que hereda de trabajadores con los ":"
Le indicamos al constructor que los valores "Nombre" Apellidos" y "dni" los coge de Trabajadores.
*/
class Asalariados(
    nombre: String,
    apellidos: String,
    dni: String,
    var sueldo: Int,
    var nPagas: Int,
    var contratado: Boolean? = true
) : Trabajadores(nombre, apellidos, dni) {



        override fun mostrarDatos(): String {

//        super.mostrarDatos()
            return super.mostrarDatos() + "Sueldo: $sueldo, Numero de Pagas: $nPagas, Contratadol: $contratado."
    }

}