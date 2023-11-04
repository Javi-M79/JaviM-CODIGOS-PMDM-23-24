package Ejercicios//3	Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión),
// sustituyendo los siguientes:

//1.	Múltiplos de 3 por la palabra "fizz".
//2.	Múltiplos de 5 por la palabra "buzz".
//3.	Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".


fun main() {

    fizzBuzz()

}


fun fizzBuzz() {
    for (i in 1..100) {//Creamos un bucle for con el rango de 1 a 100.
        if ((i % 5 == 0 || 5 % i == 0) && (i % 3 == 0 || 3 % i == 0)) {
            println("fizzbuzz")
        } else if (i % 3 == 0) {
            println("fizz")
        } else if (i % 5 == 0) {
            println("buzz")
        } else
            println(i)
    }
}







