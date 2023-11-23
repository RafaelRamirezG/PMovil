package clases

class Koopa:Enemy("Koopa",2) {
    init {
        println("Iniciando subclase $name")
    }
    /*override fun collision(collider:String){
        super.collision(collider)
        println("Usando la colision de la clase Enemy")
    }*/
    private var state = "Normal"
    override fun collision(collider:String){
        when(collider){
            "Weapon" -> {
                state = "Shell"
                println("El estado ahora es $state")
            }
            "Enemy" -> changeDirection()
        }
    }
}