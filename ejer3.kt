// algoritmo que solicite el nombre y la materia de un estudiantes 
// y 3 notas parciales y se calcule el promedio de las notas
//condicional doble


fun main() {
    println("Ingrese su nombre: ")
    var nombre = readLine().toString()

    println("Ingrese la materia: ")
    var materia = readLine().toString()

    println("Ingrese la nota 1: ")
    var nota1 = readLine()!!.toDouble()

    println("Ingrese la nota 2: ")
    var nota2 = readLine()!!.toDouble()

    println("Ingrese la nota 3: ")
    var nota3 = readLine()!!.toDouble()

    var prom = (nota1 + nota2 + nota3) / 3
    println("El promedio de notas es: $prom")

    if (prom >= 3.5){
        println("El estudiante $nombre GANO la materia $materia")
    }else {
        println("El estudiante $nombre PERDIO la materia $materia")
    }
}