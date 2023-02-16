// algoritmo que permita calcular el
// promedio de n estudiantes, que 
// nos imprima la cantidad de estudiantes
// y el promedio total de los promedios

// iteracion con for

fun main() {
    print("Ingrese la cantidad de estudiantes: ")
    var cantEstudiantes = readLine()!!.toInt()
    var sumaProm = 0.0

    for (i in 1..cantEstudiantes) {
        println("Ingrese el promedio del estudiante $i: ")
        var prom = readLine()!!.toDouble()
        sumaProm += prom
        
    }
    var promTotal = sumaProm / cantEstudiantes
    println("Cantidad de estudiantes procesados: $cantEstudiantes")
    println("Promedio total de los promedios: $promTotal")
}