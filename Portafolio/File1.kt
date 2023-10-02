import kotlin.math.pow
import kotlin.math.floor
import kotlin.math.log
import kotlin.math.roundToInt

fun main(){

}

fun login(user:String,password:String):Boolean{
    fun validate(input:String):Boolean{
        if(input.isEmpty()){
            return false
        }
        return true
    }

    val userValidated:Boolean = validate(user)
    val passwordValidated: Boolean = validate(password)

    return userValidated && passwordValidated
}

fun RA(base:Double,h:Double):Double{
    return base * h
}

fun impr(
    valor:String = "Este es el primer valor por defecto",
    valor2:String = "Este es el segundo valor por defecto"){
    println(valor)
    println(valor2)
}

fun prom(a:Float = 8F, b:Float = 8F, c:Float):Float{
    val promedio = (a+b+c)/3
    return promedio.roundToInt().toFloat()

}