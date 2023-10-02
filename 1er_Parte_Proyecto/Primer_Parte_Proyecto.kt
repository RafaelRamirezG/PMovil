//val hoteles
val hoteles: Map<String, String> = mapOf(
    "Aguascalientes" to "Hotel AGU",
    "Baja California" to "Hotel BCN",
    "Baja California Sur" to "Hotel BCS",
    "Campeche" to "Hotel CAM",
    "Chiapas" to "Hotel CHP",
    "Chihuahua" to "Hotel CHH",
    "Ciudad de Mexico" to "Hotel CMX",
    "Coahuila" to "Hotel COA",
    "Colima" to "Hotel COL",
    "Durango" to "Hotel DUR",
    "Estado de Mexico" to "Hotel MEX",
    "Guanajuato" to "Hotel GUA",
    "Guerrero" to "Hotel GRO",
    "Hidalgo" to "Hotel HID",
    "Jalisco" to "Hotel JAL",
    "Michoacán" to "Hotel MIC",
    "Morelos" to "Hotel MOR",
    "Nayarit" to "Hotel NAY",
    "Nuevo Leon" to "Hotel NLE",
    "Oaxaca" to "Hotel OAX",
    "Puebla" to "Hotel PUE",
    "Queretaro" to "Hotel QUE",
    "Quintana Roo"  to "Hotel ROO",
    "San Luis Potosi" to "Hotel SLP",
    "Sinaloa" to "Hotel SIN",
    "Sonora" to "Hotel SON",
    "Tabasco" to "Hotel TAB",
    "Tamaulipas" to "Hotel TAM",
    "Tlaxcala" to "Hotel TLA",
    "Veracruz" to "Hotel VER",
    "Yucatan" to "Hotel YUC",
    "Zacatecas" to "Hotel ZC"
)
fun main() {
    var nombreHotel: String? = null
    println("Ingrese el destino al que le gustaria viajar: ")
    val destino = readLine()
    for ((key, value) in hoteles){
        if (destino == key){
            nombreHotel = value
        }
    }
    val tipodeReservacion = "Premium"
    println("Ingresa Tu nombre")
    val nombreCliente = readLine()
    println("Ingresa Fecha de reservacion ex: 00/00/00")
    val fechaDeReserva = readLine()
    val tickect = """
        -----------------------------------------
                     TICKECT BOOKING
                     
         Hotel: $nombreHotel                 
         Tipo de reserrvacion: $tipodeReservacion     
         Fecha de reservacion: $fechaDeReserva 
         Cliente: $nombreCliente
                                
                             Total: $2000   
        _________________________________________
        """
    println(tickect)
}

