// algoritmo que lea un numero y 
// determine si este es divisible 
// entre 11

// iteracion  con for 

fun main(){
    print("Ingrese la cantidad de numeros a procesar")
    var cantidad = readLine()!!.toInt()

    for (i in 1..cantidad) {
        print("ingrese un numero: ")
        var numero = readLine()!!.toInt()

        if (numero % 11 == 0){
            println("El numero $numero es divisible entre 11")
        }else {
            println("El numero $numero no es divisible entre 11")
        }
    }
}