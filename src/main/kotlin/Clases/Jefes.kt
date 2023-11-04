package Clases

class Jefes(nombre: String, apellidos: String, dni: String, var acciones: Int, var beneficio: Int) :
    Trabajadores(nombre, apellidos, dni) {


    fun despedir() { //Puede recibir como parametro unaArray list de autonomos o asalariados. Utilizar sobrecarga de funciones

        //Mostrar el listado de los trabajadores flitrando por asalariados y autonomos


        //Una vez mostrado indicar el DNI del trabajador que va a ser despedido.

        println("Introduzca el numero de empleado del trabajador:")


        //Confirmar que desea eliminar ese trabajador


//    println("Desea despedir al trabajador? S/N")
//        var despedir = readLine()
//
//    if(despedir.equals ("S")
        //Eliminar de la lista a ese trabajador y añadirlo a un Array de despedidos. Posteriormente se podran volver a contratar.

        println("Esta seguro que desea despedir al trabajador + (numero de empleado)?")// Incluir numero de empleado


    }


    override fun mostrarDatos() :String {

        return super.mostrarDatos() + "Numero de acciones: $acciones, Beneficio: $beneficio. "




    }


}