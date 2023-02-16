// saber si una persona es mayor de edad o no es
// condicionales simples
fun main() {
    println("Ingrese la edad: ")
    var edad = readLine()!!.toInt()

    if (edad < 18){
        println("la persona es menor de edad")
    }
    println("la edad es: $edad")
}