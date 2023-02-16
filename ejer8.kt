// haga un algoritmo que dependiendo
// del codigo ingresado, realice la 
// accion correspondiente

//condicionales con when

fun main(){
var menu="""
MENU DE OPCIONES
1. Saludar
2. Pedir Nombre de una Persona
3. Sumar 2 Números
Ingrese una opción :"""
print(menu)
var opcion=readLine()?.toInt()
when (opcion) {
1 -> println("Hola!")
2 -> {
print("Ingresa el nombre de una persona: ")
var name = readLine()
println("Hola, $name")
}
3 -> {
print("Ingresa el primer número: ")
var num1 = readLine()!!.toInt()
print("Ingresa el segundo número: ")
var num2 = readLine()!!.toInt()
println("La suma de $num1 y $num2 es ${(num1 + num2)}")
}
else -> println("Opción inválida")
}
}
