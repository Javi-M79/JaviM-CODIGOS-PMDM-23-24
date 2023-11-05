package Clases

class Empresa() {


    val listaTrabajadores = ArrayList<Trabajadores>()
    val listaJefes = ArrayList<Jefes>()
    val listaAsalariados = ArrayList<Asalariados>()
    val listaAutonomos = ArrayList<Autonomos>()


    fun registrarTrabajador(): ArrayList<Trabajadores> {

        println("Indique el tipo de trabajador que quiere registrar:")
        println("1.Jefes.")
        println("2.Asalariados.")
        println("3.Autonomos.")
        println("4.Salir.")

        var salir = false
        val seleccion = readln().toInt()

        while (!salir) {

            when (seleccion) {


                1 -> {
                    println("Introduzca el nombre:")
                    var nombre = readln()
                    println("Introduzca el apellido:")
                    var apellidos = readln()
                    println("Introduzca el DNI:")
                    var dni = readln()
                    println("Introduzca el numero de acciones:")
                    var acciones = readln().toInt()
                    println("Introduzca el beneficio obtenido:")
                    var beneficio = readln().toInt()

                    val jefe: Trabajadores =
                        Jefes(nombre, apellidos, dni, acciones, beneficio)

                    listaJefes.add(jefe as Jefes)
                    listaTrabajadores.add(jefe)
                    println("Trabajador registrado con exito.")

                    println("Datos del trabajador registrado:\n" + jefe.mostrarDatos())
                    return listaTrabajadores


                }

                2 -> {
                    println("Introduzca el nombre:")
                    var nombre = readln()
                    println("Introduzca el apellido:")
                    var apellidos = readln()
                    println("Introduzca el DNI:")
                    var dni = readln()
                    println("Introduzca el sueldo anual:")
                    var sueldo = readln().toInt()
                    println("Introduzca el numero de pagas:")
                    var nPagas = readln().toInt()
                    var contratado = true

                    val asalariado: Trabajadores = Asalariados(nombre, apellidos, dni, sueldo, nPagas, contratado)

                    listaAsalariados.add(asalariado as Asalariados)
                    listaTrabajadores.add(asalariado)

                    println("Trabajador registrado con exito.")

                    println("Datos del trabajador registrado:\n" + asalariado.mostrarDatos())


                }

                3 -> {


                    println("Introduzca el nombre:")
                    var nombre = readln()
                    println("Introduzca el apellido:")
                    var apellidos = readln()
                    println("Introduzca el DNI:")
                    var dni = readln()
                    println("Introduzca el sueldo anual:")
                    var sueldo = readln().toInt()


                    var contratado = true

                    val autonomo: Trabajadores = Autonomos(nombre, apellidos, dni, sueldo, contratado)

                    listaAutonomos.add(autonomo as Autonomos)
                    listaTrabajadores.add(autonomo)

                    println("Trabajador registrado con exito.")
                    println("Datos del trabajador registrado:\n" + autonomo.mostrarDatos())


                }

                4 -> salir = true

                else -> println("Introduzca una opcion valida.")
            }
        }
        return listaTrabajadores
    }

    fun listarTrabajadores() {

        println("Lista de Jefes: ")
        listaJefes.forEach { e -> println(e.mostrarDatos()) }

        println("Lista de Asalariados: ")
        listaAsalariados.forEach { e -> println(e.mostrarDatos()) }

        println("Lista de Autonomos: ")
        listaAutonomos.forEach { e -> println(e.mostrarDatos()) }

    }


}





