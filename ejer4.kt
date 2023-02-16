// algoritmo que indique si una persona es menor a 18 indique que es menor, de lo contrario
//indique que es mayor de edad

// condiciones dobles

fun main() {
    println("Ingrese la edad:")
    var edad = readLine()!!.toInt()

    if (edad < 18 ){
        println("la persona es menor de edad")
    }else {
        println("la persona es mayor de edad")
    }
    println("la edad es: $edad")
}