fun main(){
    print("Ingresa el valor de X1 y presiona enter (escribe solo el numero): ")
    val x1: Int = readln().toInt()
    print("Ingresa el valor de Y1 y presiona enter (escribe solo el numero): ")
    val y1: Int = readln().toInt()
    print("Ingresa el valor de X2 y presiona enter (escribe solo el numero): ")
    val x2: Int = readln().toInt()
    print("Ingresa el valor de Y2 y presiona enter (escribe solo el numero): ")
    val y2: Int = readln().toInt()
    val numerador = y2.minus(y1)
    val denominador = x2.minus(x1)
    val m1 = numerador/denominador
    val m2 = numerador.toFloat()/denominador.toFloat()
    println("El valor de la pendiente erronea es: $m1")
    println("El valor de la pendiente corregido es: $m2")
}