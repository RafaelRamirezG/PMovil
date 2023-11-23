import clases.Goomba
import clases.Koopa
import clases.Mario

fun main(){

    var mario = Mario()
    /*
    for(i in 1..5){
        if (mario.isAlive){
            mario.collision(collisionObj = "Goomba")
            println("Te quedan ${mario.getLives()}")
        }
    }
    mario.collision(collisionObj = "Star")

    val enemy = Goomba()
    */
    val koopa = Koopa()
    koopa.collision("Weapon")
}