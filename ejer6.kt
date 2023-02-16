// haga un algoritmo que solicite
// 2 numeros y valide cual es el
//mayor de los 2 o son iguales

// condicionales anidados

fun main() {
    println("ingresa el numero 1: ")
    var a = readLine()!!.toInt()
    println("ingresa el numero 2: ")
    var b = readLine()!!.toInt()

    if (a > b ) {
        println("$a es mayor que $b")
    }else{
        if(b > a ) {
            println("$b es mayor que $a")
        }else {
            println("$a y $b son iguales")
        }
    }
    println("\nTermino la estructura")
}