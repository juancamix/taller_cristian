// haga un algoritmo que solicite el 
//ingreso de un numero y indique el
//dia correspondiente, valide si el 
//codigo no existe

//condicionales con when

fun main(){
    var DayNum = 5

    when (DayNum) {
        1 ->println("lunes")
        2 ->println("martes")
        3 ->println("miercoles")
        4 ->println("jueves")
        5 ->println("viernes")
        6 ->println("sabado")
        7 ->println("domingo")
        else -> println("dia invalido")
    }
}