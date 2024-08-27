package org.kouassi

fun triangle(hauteur: Int): String {
    val sb = StringBuilder()

    for (i in 1..hauteur) {
        for (j in 1..i) {
            sb.append(". ")
        }
        sb.appendLine()
    }

    return sb.toString()
}

fun trianglesDeSuite(nombreDeTriangles: Int, hauteur: Int): String {
    val sb = StringBuilder()

    for (i in 1..nombreDeTriangles) {
        sb.append(triangle(hauteur))
        sb.appendLine()
    }

    return sb.toString()
}

fun main() {
    val nombreDeTriangles = 5
    val hauteur = 4
    val result = trianglesDeSuite(nombreDeTriangles, hauteur)
    println(result)
}