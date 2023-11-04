package Clases

import Clases.Trabajadores


fun main() {



    var listaTrabajadores = ArrayList<Trabajadores>()
    var listaJefes = ArrayList<Jefes>()
    var listaAsalariados = ArrayList<Asalariados>()
    var listaAutonomos = ArrayList<Autonomos>()

//INSTANCIA DE UN OBJETO TRABAJADOR GENERAL

    var t1: Trabajadores =
        Trabajadores("Javier", "Mira", "12345678L")//Podria decidir si lo paso a Jefe, autonomo, asalariado.

    //JEFES

    var jefe1: Trabajadores = Jefes("Javier", "Mira", "125664G", 520, 25000)
    var jefe2: Trabajadores = Jefes("Luis", "Perez", "587844L", 100, 6000)
    var jefe3: Trabajadores = Jefes("Laura", "garcia", "698741J", 200, 10000)

    //ASALARIADOS

    var aS1: Trabajadores = Asalariados("Juan", "Menor", "54123689T", 14000, 14, true)
    var aS2: Trabajadores = Asalariados("Pedro", "Aceituno", "45236987F", 14000, 14, true)
    var aS3: Trabajadores = Asalariados("Antonio", "Gonzalez", "4566987P", 14000, 14, true)

    //AUTONOMOS

    var at1: Trabajadores = Autonomos("Antonio", "Gonzalez", "4566987P", 14000, true)
    var at2: Trabajadores = Autonomos("Antonio", "Gonzalez", "4566987P", 14000, true)
    var at3: Trabajadores = Autonomos("Antonio", "Gonzalez", "4566987P", 14000, true)


    at1.mostrarDatos()


//
//    for (i in listaJefes) {
//        println(i)
//
//    }




}