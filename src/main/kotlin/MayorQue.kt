// 1.	(MayorQue) Hágase un programa que lea dos enteros y compruebe si el primero es o no mayor que el segundo.
// En la salida se mostrará “El primero es mayor que el segundo” o “El primero no es mayor que el segundo”.

fun main() {



    println("Introduce un numero:")


    // Creamos las variables
    val n1 =
        readLine()?.toInt()//Hacemos un cast del String a entero. Debe tener el operador Safe Call Operator "?". readLine puede ser nulo por eso debemos incluir el operador
    println("Introduce otro numero:")
    val n2 = readLine()?.toInt() ?: 0

//Llamada a la funcion comprobando que los valores introducidos no son nulos.
//    if (n1 != null && n2 != null) {//COMENTAR CON EL PROFESOR SI ES INTERESANTE ESTA OPCION.//
    mayorQue(n1 ?: 0, n2 ?: 0)
}



fun mayorQue(
    n1: Int,
    n2: Int
): Unit {//La palabra reservada "Unit" hace referencia a no retonar nada en la funcion. Es el equivalente en Java a "Void".
    if (n1 > n2) {
        println("$n1 es mayor que $n2")
    } else if (n1 == n2) {
        println("Los numeros introducidos son iguales.")
    } else {
        println("$n1 no es mayor que $n2")
    }
}

