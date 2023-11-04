package Ejercicios//Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en una variable. El sistema irá pidiendo números
//al usuario hasta que coincida con el aleatorio generado (en caso de no coincidir mostrará el mensaje "Lo siento, inténtalo de nuevo").
//Cuando coincida el sistema deberá mostrar el mensaje "Enhorabuena, has acertado el número en 5 intentos" (Adivina)


fun main() {

    numeroSecreto()

}

fun numeroSecreto() {

    //Creamos el numero aleatorio
    val nSecreto = (Math.random() * 20 + 1).toInt()
    //println("El numero introducido has sido $nSecreto")
    var contador = 0
    var salir = false
    println("Introduce un numero:")
    var nUser = readLine()?.toInt()
    contador++//Incrementamos el contador en el primer intento, si no no lo contaria.


    while ((nUser != nSecreto) && !salir) {

        println("Lo siento, inténtalo de nuevo")
        nUser = readLine()?.toInt() //Prestar atencion a no volver a crear la variable dentro del bucle, pues seria difernete a la de fuera y no saldriamos a no ser que acertasemos a la primera.
        contador++

        if (nUser == nSecreto) {

            println("Enhorabuena, has acertado el número en $contador intentos")

            println("Quieres volver a jugar? (S/N)")
            val jugar = readLine()

            if (jugar.equals("S", ignoreCase = true)) {//En Kotlin podemos usar "==" para comparar cadenas. ??
//                salir = false
                numeroSecreto()

            } else if (jugar.equals("N", ignoreCase = true)) {
                println("Programa terminado.")
                salir = true

            }


        }

    }


}