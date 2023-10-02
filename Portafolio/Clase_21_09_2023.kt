
fun main(){
    //verifyAge()
    //gradoEscolar()
    //Tri()
    //tipodato()
    /*
    for (i in 1 until 5){
        println(i)
    }

    for (i in 1 until 10 step 2){
        println(i)
    }*/



}

fun verifyAge(){
    print("Ingresa tu edad y presiona enter (escribe solo el numero):")
    val age = readln()?.toInt()

    if(age!! > 18){
        println("Ya eres mayor de edad!")
    } else if(age!! == 18){
        println("Acabas de cumplir la mayoria de edad!")
    } else {
        println("Eres menor de edad")
    }
}

fun gradoEscolar(){
    print("Ingresa edad y presiona enter (escribe solo el numero): ")
    val age = readLine()?.toInt()

    when(age){
        0 -> println("Apenas eres recien nacido!")
        1 -> println("Solo tienes un año de edad!")
        in 2..5 -> println("Estas en preescolar")
        in 6..11 -> println("Estas en primaria")
        in 12..14 -> println("Estas en secundaria")
        in 15..17 -> println("Estas en bachillerato")
        in 18..25 -> println("Estas en la universidad")
        else -> {
            println("Edad Invalida")
            println("Vuelve a correr el codigo")
        }
    }
}
/*
fun Tri(l1: Int, l2:Int,l3:Int){
    println("Ingresa la medida del primer lado (escribe solo el numero): ")
    val a = readLine()?.toInt()
    println("Ingresa la medida del segundo lado (escribe solo el numero): ")
    val b = readLine()?.toInt()
    println("Ingresa la medida del tercer lado (escribe solo el numero): ")
    val c = readLine()?.toInt()

    if(a!! == b!!){
        if(b == c!!) {
            println("Es un triangulo equilatero")
        }
        else {
            println("Es un triangulo isoceles")
        }
    } else if ()
}*/
/*
fun tipodato(){
    println("Ingresa algo: ")
    val entrada = readLine()
    when(entrada){
        is String -> println("Es una string")
        is Int -> println("Es un entero")
        is Double -> println("Es un double")
        else -> println("Tipo de dato no soportado")
    }

}*/
