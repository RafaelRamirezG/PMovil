package clases

import java.util.*
import kotlin.concurrent.schedule

class Mario(var vidas: Int = 3) {
    init{
        println("It's me Mario")
    }
    private var state = "Small"
        set(value){
            val before = field
            field = value
            println("Tu estado ahora es $field")
            if(value=="Star"){
                Timer("SettinUp",false).schedule(10000){
                    field = before
                    println("Tu estado ahora es $field")
                }
            }
        }
    private var lives = 3
        set(value){
            if (field == 1){
                field = 0
            }
            else if (field == 0){
                gameOver()
                println("Necesitas volver a jugar")
            }
            else{
                field = value
            }
        }
    val isAlive:Boolean
        get(){
            return lives >= 1
        }
    /*
    private fun die(){
        lives--
        println("Has perdido una vida")
    }*/
    public fun collision(collisionObj:String){
        when(collisionObj){
            "Goomba" -> lives--
            "Super Mushroom" -> state = "Super Mario"
            "Fire flower" -> state = "Fire Mario"
            "Star" -> state = "Star"
            else -> println("Objeto Desconocido")
        }
    }
    private fun gameOver(){
        println("GAME OVER")
    }
    fun getLives():String{
        return "$lives vidas"
    }
}
