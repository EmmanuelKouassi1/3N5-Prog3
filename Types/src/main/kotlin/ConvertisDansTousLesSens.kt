package org.kouassi

fun main(){
    var int : Int=2
    var IntAFloat = int.toFloat()
    println(IntAFloat)

    var double : Double = 1.2
    var DoubleAInt = double.toInt()
    println(DoubleAInt)

    var string : String = "Nice"
    var StringAInt = string.toInt()
    println(StringAInt)

    var IntAString = int.toString()
    println(IntAString)

    var float : Float = 2.7182818284f
    var FloatADouble = float.toDouble()
    println(FloatADouble)
}