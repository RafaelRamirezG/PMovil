const val number3 = 24F
const val PI = 3.1416
fun main(){
    val number1 = 12
    var number2 = 34
    number2 = 20
        println("Numero 1: $number1")
    println("Numero 2: $number2")
    println("Numero 3: $number3")
    println("El tipo de dato asignado por defecto es: ${number1::class.simpleName}")
    println("")
    val decimal = 30
    var perimetro = PI * (decimal * 2)
    println("El perimetro cuando decimal vale $decimal es: $perimetro")
}