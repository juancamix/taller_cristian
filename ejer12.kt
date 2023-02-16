// Algoritmo que imprima los numeros pares del 1 
//al n
// iteracion con while
fun main(){
    print("Ingrese un numero: ")
    var n = readLine()!!.toInt()
    var i = 1
    while ( i <= n){
        if (i % 2 == 0){
            println(i)
        }
        i++
    }
}