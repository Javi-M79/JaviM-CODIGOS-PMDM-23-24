package Clases

import Clases.Trabajadores


fun main() {


    val gestion: Empresa = Empresa()
    gestion.registrarTrabajador()


    val listaTrabajadores = gestion.registrarTrabajador()
//    val listaJefes = gestion.registroTrabajadores()
//    val listaAsalariados = gestion.registroTrabajadores()
//    val listaAutonomos = gestion.registroTrabajadores()


    gestion.listarTrabajadores()

//    listaTrabajadores.forEach { e -> println("Total trabajadores en la empresa:\n" + e.mostrarDatos()) }

    /*
     //USO DEL POLIMORFISMO

     var jefe1: Trabajadores = Jefes("Javier", "Mira", "125664G", 520, 25000)
     var jefe2: Trabajadores = Jefes("Luis", "Perez", "587844L", 100, 6000)
     var jefe3: Trabajadores = Jefes("Laura", "Garcia", "698741J", 200, 10000)

     //AÑADIR A LISTA ESPECIFICA Y GENERAL DE TRABAJADORES

     listaJefes.add(jefe1 as Jefes)
     listaJefes.add(jefe2 as Jefes)
     listaJefes.add(jefe3 as Jefes)
     listaTrabajadores.add(jefe1)
     listaTrabajadores.add(jefe2)
     listaTrabajadores.add(jefe3)
     val listaDespedidos = jefe1.despedirAsalariado(listaAsalariados)
     */

    /*
    Mostramos la lista de Jefes

    for (i in listaJefes) {
    println(i.mostrarDatos())
    }
    ASALARIADOS
    */

//    var aS1: Trabajadores = Asalariados("Juan", "Menor", "54123689T", 25000, 14, true)
//    var aS2: Trabajadores = Asalariados("Pedro", "Aceituno", "45236987F", 28000, 14, true)
//    var aS3: Trabajadores = Asalariados("Antonio", "Gonzalez", "4566987P", 47000, 14, true)


//COMPROBACION DEL METODO MOSTRAR DATOS Y DEMAS ATRIBUTOS

//    println(aS2.nombre)
//    println(aS2.apellidos)
//    println(aS2.mostrarDatos())
//
//    listaAsalariados.add(aS1 as Asalariados)
//    listaAsalariados.add(aS2 as Asalariados)
//    listaAsalariados.add(aS3 as Asalariados)
//    listaTrabajadores.add(aS1)
//    listaTrabajadores.add(aS2)
//    listaTrabajadores.add(aS3)


    /*  Mostrar lista Asalariados.

      for (i in listaAsalariados) {
          println(i.mostrarDatos())
      }*/

    //AUTONOMOS
//
//    var at1: Trabajadores = Autonomos("Antonio", "Gonzalez", "4566987P", 34000, true)
//    var at2: Trabajadores = Autonomos("Pepe", "Gutierrez", "12587945U", 45000, true)
//    var at3: Trabajadores = Autonomos("Alberto", "Bermejo", "1185479J", 28000, true)
//
//    listaAutonomos.add(at1 as Autonomos)//Le hago un Cast ya que at1 es de tipo Trabajador y lo incluimos en Autonomos.
//    listaAutonomos.add(at2 as Autonomos)
//    listaAutonomos.add(at3 as Autonomos)
//    listaTrabajadores.add(at1)
//    listaTrabajadores.add(at2)
//    listaTrabajadores.add(at3)
//

    /* Mostrar la lista de autonomos

    for (i in listaAutonomos) {
        println(i.mostrarDatos())
    }

     */

//Mostrar todos los trabajadores registrados.

//    for (i in listaTrabajadores) {
//        println(i.mostrarDatos())
//
//    }


    //METODO DESPEDIR JEFES

//    jefe1.despedirAsalariado(listaAsalariados)


}

