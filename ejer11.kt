//algoritmo que solicite n cantidad de numeros
//hasta que el usuario ingrese el numero 5

//iteracion con while

fun main(){
    var numero = 0
    while (numero != 5){
    print("Ingrese un número: ")
    numero = readLine()!!.toInt()
    }
    println("Ha ingresado el número 5.")
}
