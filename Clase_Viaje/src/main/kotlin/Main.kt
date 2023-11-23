import clases.NationalLowSeason

fun main() {
    /*
    val viajeMonterrey = National("Monterrey")
        viajeMonterrey.quotePrice(4)
        viajeMonterrey.reserve(4)
    */
    val viajeMonterreyDescuento = NationalLowSeason("Monterrey")
    viajeMonterreyDescuento.reserve(4)

}