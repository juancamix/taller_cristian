// haga eun algoritmo que calcule el promedio de 3 numeros si el promedio es mayor a 3.5
// indique que gana la materia, si el promedio es mayor a 2 y menor o igual a 3.5 puede
//recuperar

// condicionales anidados

fun main() {
    var num1 = 2.0
    var num2 = 1.0
    var num3 = 1.0

    var prom = (num1 + num2 + num3) / 3

    if (prom > 3.5){
        println("Gana la materia")
    }else if (prom > 2.0){
        println("Puede recuperar")
    }else {
        println("Perdio la materia")
    }
}