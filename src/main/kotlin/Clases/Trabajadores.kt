package Clases


/*
Las clases en KT pueden tener constructores primarios y secundarios.
Los constructores primarios se crean junto con la definicion de la clase.
NO NECESITAMOS CREAR LAS VARIABLES YA QUE SE CREAN EN EL CONSTRUCTOR PRIMARIO AL DEFINIR LA CLASE.
*/
/*
A diferencia de Java aqui no se tiene que usar this.nombre = nombre, this. apellido = apellido etc..al haberlos definido ya en el constructor.
En Kotlin los getters y Setters van implicitos. No se crean en la clase.Ver ejemplo creado en "Entrada.kt"
Si queremos que los getters y setters hagan algo diferente se lo debemos indicar en las variables que no tiene el construtor primario
Por ejemplo si creamos un valor nuevo como por ejemplo el correo.
var correo : String? = null
    set(value) {
    it = value Donde it hace referencia al correo. APLICA A LA VARIABLE QUE ESTA ENCIMA DEL CODIGO.
     }

*/

open class Trabajadores(val nombre: String, val apellidos: String, val dni: String) {

//Mejorar la aplicacion añadiendo un numero de empleado random.


    open fun mostrarDatos(): String {

        return "Nombre: $nombre, Apellido: $apellidos, DNI: $dni "

    }

}




