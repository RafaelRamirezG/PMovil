import clases.*
fun main(){
    val miVehiculo = Vehicle("Ford", "Focus", "Verde")
    miVehiculo.placas = "REM-4123"
    println("El vehiculo esta encendido? ${miVehiculo.encendido}")
    miVehiculo.enceder()
    println("El vehiculo esta encendido? ${miVehiculo.encendido}")
    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07f)
    println("El tanque tiene ${miVehiculo.gasolina}")
    val golNegro = Vehicle("Volkswagen", "Gol","Negro")
    println("Color del Gol ${golNegro.color}")
    val pointer = Vehicle(
        color = "Azul",
        marca = "Volkswagen",
        modelo = "Pointer"
    )
    println("Color del Pointer ${pointer.color}")









    /*
    val scaryMovie =Movie("Scary Movie", "Comedia",88.27)
    //println(scaryMovie)
    scaryMovie.createdAt="2000"
    //println(scaryMovie.component3())
    //println(scaryMovie.createdAt)

    val (name2,gender2,duration2) = scaryMovie
    //println("Nuevas variables $name2, $gender2, $duration2")

    val (_,gender3,duration3) = scaryMovie
    //println("Nuevas variables $gender3, $duration3")

    val scaryMovie2 = scaryMovie.copy(name = "Scary Movie 2", duration = 83.0)
    println("""
        Scary Movie: $scaryMovie
        Scary Movie 2: $scaryMovie2
    """.trimIndent())
    val vehicleInstance = Vehicle.create()

    var saludo = {println("Hola")}()
    var a = 5
    var b = 6
    var suma = { println("Suma ${a+b}")}()

    val suma = {a:Int,b:Int -> a+b}
    print(suma(4,5))

    //val presentarse: (String, Int) -> String = {name, age -> "Me llamo $name y tengo $age años"}
    //println(presentarse("Rafael", 21))

    //Lambda
    val saverGrade: (Double, Double) -> String = { expected: Double, saved: Double ->
        val percentage = saved / expected
        when {
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Ahorrador aprendiz"
        }
    }
    println(saverGrade(100.0,120.0))

    //Funcion Anonima
    val saverGrade2 = fun(expected: Double, saved: Double): String{
        val percentage = saved / expected
        return when {
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Ahorrador aprendiz"
        }
    }
    println(saverGrade2(100.0,70.0))

    val suma = {a:Int,b:Int -> a+b}
    fun sumaOrdenSuperior(a: Int, b:Int, suma:(Int,Int) -> Int):Int{
        return suma(a,b)
    }
    println(sumaOrdenSuperior(4,5, suma))
Declaramos nuestra funcion de orden superior

    fun calculadora(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b)
    }
Funciones inline por cada una de nuestras operaciones
    fun suma(a: Int, b: Int) = a + b
    fun resta(a: Int, b: Int) = a - b
    fun multiplica(a: Int, b: Int) = a * b

Almacenamos el resultado de cada operacion en una variable
    val suma = calculadora(10, 5, ::suma)
    val restar = calculadora(10, 5, ::resta)
    val multiplicar = calculadora(10, 5, ::multiplica)
    */
}
