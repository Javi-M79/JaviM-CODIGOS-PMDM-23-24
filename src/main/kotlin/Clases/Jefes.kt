package Clases

class Jefes(nombre: String, apellidos: String, dni: String, var acciones: Int, var beneficio: Int) :
    Trabajadores(nombre, apellidos, dni) {


    fun despedir(listaTrabajadores: ArrayList<Trabajadores> = ArrayList<Trabajadores>()) { //Puede recibir como parametro unaArray list de autonomos o asalariados. Utilizar sobrecarga de funciones



        println("Eliga el tipo de trabajador a despedir: \n  1. - Autonomo \n 2.  Asalariado")


                //FILTRAR Y MOSTRAR AUTONOMOS DENTRO DE LA LISTA DE TRABAJADORES

//
//
//            }else{
//                //FILTRAR Y MOSTRASR ASALARIADOS DENTRO DE LA LISTA DE TRABAJADORES
//
//            }
//
//        //Mostrar el listado de los trabajadores flitrando por asalariados y autonomos
//
//
//        println("Indique tipo de trabajador desea despedir: Autonomo / Asalariado")
//        val despido = readLine()
//
//        if (despido.equals("Autonomo", ignoreCase = true)) {
//            println()
//        }


        //Una vez mostrado indicar el DNI del trabajador que va a ser despedido.


        //Confirmar que desea eliminar ese trabajador


//    println("Desea despedir al trabajador? S/N")
//        var despedir = readLine()
//
//    if(despedir.equals ("S")
        //Eliminar de la lista a ese trabajador y añadirlo a un Array de despedidos. Posteriormente se podran volver a contratar.

        println("Esta seguro que desea despedir al trabajador + (numero de empleado)?")

        //Finalmente al objetop se le cambia el tipo de contrato a False.


    }


    override fun mostrarDatos(): String {

        return super.mostrarDatos() + "Numero de acciones: $acciones, Beneficio: $beneficio. "


    }


}