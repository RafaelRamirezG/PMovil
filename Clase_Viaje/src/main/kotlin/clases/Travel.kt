package clases

abstract class Travel {
    abstract protected val country: String
    abstract protected val city: String
    protected var serviceType = "Viaje"
    protected var reserved = false
    protected var paidAmount = 0

    abstract fun quotePrice(numDays: Int)
    protected abstract fun getPrice(numDays: Int):Int

    fun reserve(numDays: Int){
        if(reserved){
            println("""¡Ya esta reservado tu viaje!
				   Pais: $country
				   Ciudad: $city
				   Precio: $paidAmount""".trimMargin())
            return
        }
        val amount = getPrice(numDays)
        if(amount == 0){
            return
        }
        reserved = true
        paidAmount =amount
        println("""¡Viaje reservado exitosamente!
			   Pais: $country
			   Ciudad: $city
			   Precio: $paidAmount""".trimMargin())
    }
}