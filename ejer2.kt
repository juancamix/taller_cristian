// promedio de 3 notas con el nombre del estudiante
// condicionales simples

fun main() {
    var prom = 0.0
    println("Ingrese el nombre del estudiante")
    var nombre: String?= readLine()

    print("Ingresa la nota 1: ")
    var nota1 = readLine()!!.toDouble()
    print("Ingresa la nota 2: ")
    var nota2 = readLine()!!.toDouble()
    print("Ingresa la nota 3: ")
    var nota3 = readLine()!!.toDouble()

    prom = (nota1 + nota2 + nota3) / 3

    println("El promedio es $prom")

    if (prom >= 3.0){
        println("Gana la materia")
    }else {
        println("Pierde la materia")
    }
}