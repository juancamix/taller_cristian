// haga un algoritmo que solicite un numero y si es
// negativo lo convierta a positivo y lo imprima
// que se realice n cantidades

// iteracion con do while

fun main(){
    var numero: Int 
    var continuar = "si"
    do {
        print("Ingrese un numero: ")
        numero = readLine()!!.toInt()
        if (numero < 0){
            numero = numero *-1
        }
        println("El numero positivo es: $numero")
        print("¿Desea ingresar otro numero? (si/no): ")
        continuar= readLine()!!
    }while (continuar.uppercase() == "SI")
}