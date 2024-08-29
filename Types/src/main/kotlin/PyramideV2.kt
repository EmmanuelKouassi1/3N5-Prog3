package org.kouassi

fun main(array: Array<String>){
    for (v in array)
(triangle(v.toInt()))



}

fun triangle(hauteur:Int): String {
    var nbEspace:Int = hauteur-1
    var tri =""

for(l in 1..hauteur){
    for (r in 1..l)
    {
        tri+=" ".repeat(nbEspace) + "*"
    }
    nbEspace--
    tri+="\n"


}

    println(tri)
return tri

}