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


    //Funcion calculo salario mensual
    fun sueldoMensual(sueldo: Int): Int {
        return sueldo / 12

    }

    override fun mostrarDatos(): String {


        return super.mostrarDatos() + "Sueldo anual: $sueldo, Sueldo mensual: ${sueldoMensual(sueldo)}, Numero de Pagas: $nPagas, Contratado: $contratado."
    }

}