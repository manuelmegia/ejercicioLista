//Utilizando únicamente lo visto hasta ahora y este código:

//val lista = listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?")

//Realiza un programa que:

//Sume todos los números de la lista en una misma variable (Integers y Doubles juntos).

//Concatena todos los String un único String. Añadiendo un espacio por cada nuevo String.

//Se debe entregar el Main que contenga todo el código.

fun main(args: Array<String>) {
    val lista = listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?")
    var cS = ""
    var sD = 0.0
    lista.forEach {
        when (it) {
            is String -> cS += "$it "
            is Double -> sD += it
            is Int -> sD += it.toDouble()
        }
    }
    println("Suma string: $cS")
    println("Suma double: $sD")
}