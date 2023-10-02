

fun main(){
    /*
    for (nombre in nombres){
        println(nombre)
    }
    nombres.forEach{ println(it)}

    for (nombre in nombres){
        println(nombre)
        if (nombre == "Link"){
            println("Personaje encontrado")
            break
        }
    }

    val nombres = listOf(
        "Pedro Luis",
        "Juan Manuel",
        "Juan Luis",
        "María Inés",
        "Romeo",
        "Ernesto",
        "Juan Pedro",
        "Ariadna",
        "Mireya María",
        "Ana Sofía",
        "José Juan"
    )


    fun contNombre(name: String): Int{
        var count = 0
        for (currentName in nombres){
            if (name in currentName){
                count++
            }
        }
        return count
    }
    val nameCount = contNombre("Juan")
    println("Tu nombre se encontró $nameCount veces")

    var x = 20
    while (x > 0){
        println(x)
        x--
    }
    println("")
    var y = 20
    do {
        println(y)
        y--
    }while (y > 0)
    */
    val nombres = listOf(
        "Kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Link",
        "Captain Falcon",
        "Samus",
        "Pikachu",
        "Jigglypuff",
        "Donkey Kong",
        "Yoshi"
    )

    println("Numero de elementos: ${nombres.size}")
    println("Segundo elemento: ${nombres.get(1)}")
    println("Cuarto elemento: ${nombres[3]}")
    println("Ultimo elemento: ${nombres.get(nombres.size - 1)}")
    println("Index del elemento \"Samus\": ${nombres.indexOf("Samus")}")

    val list = mutableListOf(1,2,3,4)
    //Agregar elemento
    list.add(5)
    //Remover elemento
    list.removeAt(1)
    //Modificar lista
    list[0] = 0
    println(list)

    //Inmutable
    val numSet: Set<Int> = setOf(0,1,2,3,4,5)
    val reversenNumSet: Set<Int> = setOf(5,4,3,2,1,0)
    //Mutable
    var name: Set<String> = mutableSetOf("Nombre 1", "Nombre 2")

    println(numSet == reversenNumSet)
    println("")

    val namesToAges: Map<String, Int> = mapOf("user_one" to 20, "user_two" to 23)
    for ((key, value) in namesToAges){
        println("$key tiene $value años")
    }
}
