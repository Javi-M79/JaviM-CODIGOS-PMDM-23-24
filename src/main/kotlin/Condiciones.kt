//Léase un número entero. Se comprobará si dicho número es o no múltiplo de
//20, y también se comprobará si está o no entre -100 y 100.
// En la salida se mostrará uno de los siguientes mensajes:
//“Es múltiplo de 20 y está entre -100 y 100”.
// “Es múltiplo de 20 y no está entre -100 y 100”.
// “No es múltiplo de 20 y está entre -100 y 100”
// “No es múltiplo de 20 y no está entre -100 y 100”.

fun main() {

    //Solicitamos un numero al usuario

    println("Introduce un numero:")
    val n1 = readLine()?.toInt()//readLine puede ser nulo por eso debemos incluir el operador "?".



    println("El numero introducido ha sido $n1.")
//    if (n1 != null) //Comprobamos que no sea nulo para poder ejecutar la funcion
        comprobarNumero(n1?:0)


}


fun comprobarNumero(x: Int): Unit {

    if (20 % x == 0 || x % 20 == 0) {//Comprobamos que sea multiplo de 20. Incluimos como multiplos numeros mayores de 20.
        if (x > -100 && x < 100) {//Si es asi vemos si esta entre el rango solicitado.
            println("$x es múltiplo de 20 y está entre -100 y 100")
        } else {
            println("Es múltiplo de 20 y no está entre -100 y 100")
        }
    }
    if (20 % x != 0 || x % 20 != 0) {//Comprobamos que sea no sea multiplo de 20.
        if (x > -100 && x < 100) {//Si es asi vemos si esta entre el rango solicitado.
            println("$x no es múltiplo de 20 y está entre -100 y 100")
        } else {
            println("$x no es múltiplo de 20 y no está entre -100 y 100")
        }
    }

}
