package Clases

import Clases.Trabajadores


fun main() {


    val listaTrabajadores = ArrayList<Trabajadores>()
    val listaJefes = ArrayList<Jefes>()
    val listaAsalariados = ArrayList<Asalariados>()
    val listaAutonomos = ArrayList<Autonomos>()

//INSTANCIA DE UN OBJETO TRABAJADOR GENERAL

    var t1: Trabajadores =
        Trabajadores("Javier", "Mira", "12345678L")//Podria decidir si lo paso a Jefe, autonomo, asalariado.

    //JEFES

    var jefe1: Trabajadores = Jefes("Javier", "Mira", "125664G", 520, 25000)
    var jefe2: Trabajadores = Jefes("Luis", "Perez", "587844L", 100, 6000)
    var jefe3: Trabajadores = Jefes("Laura", "Garcia", "698741J", 200, 10000)


    listaJefes.add(jefe1 as Jefes)
    listaJefes.add(jefe2 as Jefes)
    listaJefes.add(jefe3 as Jefes)


    //ASALARIADOS

    var aS1: Trabajadores = Asalariados("Juan", "Menor", "54123689T", 14000, 14, true)
    var aS2: Trabajadores = Asalariados("Pedro", "Aceituno", "45236987F", 14000, 14, true)
    var aS3: Trabajadores = Asalariados("Antonio", "Gonzalez", "4566987P", 14000, 14, true)

    //AUTONOMOS

    var at1: Trabajadores = Autonomos("Antonio", "Gonzalez", "4566987P", 14000, true)
    var at2: Trabajadores = Autonomos("Pepe", "Gutierrez", "12587945U", 14000, true)
    var at3: Trabajadores = Autonomos("Alberto", "Bermejo", "1185479J", 14000, true)

    listaAutonomos.add(at1 as Autonomos)//Le hago un Cast ya que at1 es de tipo Trabajador y lo incluimos en Autonomos.
    listaAutonomos.add(at2 as Autonomos)
    listaAutonomos.add(at3 as Autonomos)


//Mostramos la lista de Jefes

    for (i in listaJefes) {
        println(i.mostrarDatos())
    }

//Mostramos la lista de autonomos

    for (i in listaAutonomos) {
        println(i.mostrarDatos())
    }


    /*    var at2: Trabajadores = Autonomos("Antonio", "Gonzalez", "4566987P", 14000, true)
     listaAutonomos.add(at2)//En este caso, no nos pide Cast al crearlo directamente de tipo Auntonommos*/


//
//    for (i in listaJefes) {
//        println(i)
//
//    }


}