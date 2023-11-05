package Clases

class Jefes(nombre: String, apellidos: String, dni: String, var acciones: Int, var beneficio: Int) :
    Trabajadores(nombre, apellidos, dni) {


    fun despedir(listaTrabajadores: ArrayList<Trabajadores> = ArrayList<Trabajadores>()) {


        println("Eliga el tipo de trabajador que quiere despedir:\n 1. Asalariado. \n 2. Autonomo.")
        val tipoTrabajador: Int = readln().toInt()

        when (tipoTrabajador) {

            1 -> {
                println("A continuacion s emuestra el listado de Asalariados:")
                val asalariados = listaTrabajadores.filterIsInstance<Asalariados>()
                asalariados.forEachIndexed { index, asalariado ->
                    println("${index + 1}-> ${asalariado.mostrarDatos()}")

                }
                println("Elija el numero de empleado que quiere despedir:")
                val seleccion: Int = readln().toInt()
                when (seleccion) { //Mientras se encuentre dentro del rango de la lista??


                }
            }


            2 -> {
                val autonomos = listaTrabajadores.filterIsInstance<Autonomos>()
                autonomos.forEachIndexed { index, autonomos ->
                    println("${index + 1}-> ${autonomos.mostrarDatos()}")
                }
            }
        }

    }


    override fun mostrarDatos(): String {

        return super.mostrarDatos() + "Numero de acciones: $acciones, Beneficio: $beneficio. "
    }

}




