package org.kouassi

fun main(array: Array<String>){
    for (v in array)
((afficherPyramide(v.toInt())))



}

fun afficherPyramide(hauteur:Int): String {
    var nbEtoile: Int = 1
    var nbEspace: Int =hauteur - 1
    var ligne: String=""
    for (i: Int in 1..hauteur){
        ligne = " ".repeat(nbEspace) + "*".repeat(nbEtoile)
        println(ligne)
        nbEtoile += 2
        nbEspace -=1
    }
return ligne

}