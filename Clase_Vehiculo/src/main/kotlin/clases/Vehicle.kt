package clases

class Vehicle() {
    //Bloque inicializador
    init {
        println("""Los datos del coche son:
        Marca: $marca
        Modelo: $modelo
        Color: $color""".trimIndent())
    }
    constructor(marca:String,modelo: String,color: String) : this() {
        this.marca = marca
        this.modelo = modelo
        this.color = color
        println("""Los datos del coche son:
            Marca: $marca
            Modelo: $modelo
            Color: $color""".trimIndent())
    }
    //Atributos
    lateinit var marca: String
    lateinit var modelo: String
    lateinit var color: String
    var placas = ""
    var gasolina = 0f
    var encendido = false
    //Metodos
    fun enceder(){
        encendido = true
    }
    fun apagar(){
        encendido = false
    }

    fun recargar(litros:Float){
        gasolina+=litros
    }

}