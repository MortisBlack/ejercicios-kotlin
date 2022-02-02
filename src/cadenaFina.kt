/**
 * Ejercicio:   Cadena fria
 * Nombre:      Jesús Antonio Urrego Gutiérrez
 * ID:          00000216768
 */

fun main() {

    println(esFina("bac"))      // false
    println(esFina("aza"))      // false
    println(esFina("abaca"))    // false
    println(esFina("baaa"))     // true
    println(esFina("aaab"))     // true

}

fun esFina(cadena: String): Boolean {

    val regex = """([a-z])\1""".toRegex()
    return if (cadena.isNullOrEmpty()) false else regex.containsMatchIn(cadena)

}