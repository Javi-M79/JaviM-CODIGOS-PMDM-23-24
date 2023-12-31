package Clases

class Jefes(nombre: String, apellidos: String, dni: String, var acciones: Int, var beneficio: Int) :
    Trabajadores(nombre, apellidos, dni) {


    fun despedirAsalariado(listaAsalariados: ArrayList<Asalariados>): ArrayList<Asalariados> {

        println("Indique el numero de trabajador que quiere despedir del listado que se muestra a continuacion:")

        val listaDespedidos = ArrayList<Asalariados>()
        listaAsalariados.forEachIndexed { index, asalariados -> println("${index + 1} .- ${asalariados.mostrarDatos()}") }//Listado de asalariados con indice.

        var seleccion = readln().toInt()
        var despedido = seleccion - 1

        if (seleccion in 1..listaAsalariados.size) {

            val trabajadorDespedido = listaAsalariados.removeAt(despedido)

            listaDespedidos.add(trabajadorDespedido)
            println("Usuario $seleccion con ${trabajadorDespedido.mostrarDatos()} despedido con exito.")
            trabajadorDespedido.contratado = false
//            println("Lista de trabajadores despedidos:\n${trabajadorDespedido.mostrarDatos()}")

            println("Lista de asalariados actualizada:")
            listaAsalariados.forEach { e -> println(e.mostrarDatos()) }


        }

        return listaDespedidos
    }


    fun despedir(listaTrabajadores: ArrayList<Trabajadores> = ArrayList<Trabajadores>()) {

        var seleccion = readln().toInt()
        var despedido = seleccion - 1

        println("Elija el tipo de trabajador que quiere despedir:\n 1. Asalariado. \n 2. Autonomo.")
        val tipoTrabajador: Int = readln().toInt()
        val listaDespedidos = ArrayList<Trabajadores>()
        when (tipoTrabajador) {

            1 -> {
                println("A continuacion se muestra el listado de Asalariados:")
                val asalariados = listaTrabajadores.filterIsInstance<Asalariados>()
                asalariados.forEachIndexed { index, asalariado ->
                    println("${index + 1}-> ${asalariado.mostrarDatos()}")

                    if (seleccion in 1..listaTrabajadores.size) {

                        val trabajadorDespedido: Trabajadores = listaTrabajadores.removeAt(despedido)

                        listaDespedidos.add(trabajadorDespedido)
                        println("Usuario $seleccion con ${trabajadorDespedido.mostrarDatos()} despedido con exito.")
//                        trabajadorDespedido.contratado = false

                    }
                    println("Elija el numero de empleado que quiere despedir:")
                    val seleccion: Int = readln().toInt()


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




