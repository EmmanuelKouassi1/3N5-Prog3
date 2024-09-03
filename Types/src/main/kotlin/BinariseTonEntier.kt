package org.kouassi

fun main(array: Array<String>){
    for (s in array){
        intABinaire(s)
    }

}
fun intABinaire(chain: String){
    var num:Int = chain.toInt()
    var binaire = Integer.toBinaryString(num)
    println(binaire)
}