/**
 *  Ejercicio:  Verifica cadena
 *  Nombre:     Jesús Antonio Urrego Gutiérrez
 *  ID:         00000216768
 */

fun main() {
    println(verificaCadena("nombre"))   // true
    println(verificaCadena("_nombre"))  // true
    println(verificaCadena("_12"))      // true
    println(verificaCadena(""))         // false
    println(verificaCadena("012"))      // false
    println(verificaCadena("no$"))      // false
}

fun verificaCadena(cadena: String): Boolean {

    fun esLetra(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun esNumero(c: Char) = c in '0'..'9'

    // Verifica que no esté vacío
    if (cadena.isNullOrEmpty()) {
        return false
    }

    // Verifica el primer caracter
    var primerC = cadena.get(0)
    if(primerC != '_' && !esLetra(primerC)) {
        return false
    }

    // Verifica todos los caracteres
    for(c in cadena){
        if(!esLetra(c) && !esNumero(c) && c != '_') {
            return false
        }
    }

    // Pasa todas las validaciones
    return true
}