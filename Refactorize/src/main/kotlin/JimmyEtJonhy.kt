package org.kouassi

import java.io.FileNotFoundException

fun lireDesFichiersJimmy() {
    for (i in 0 until 10) {
        try {
            lireFichier(i)
            println("fichier $i lu par Jimmy")
        } catch (e: FileNotFoundException) {
            println("fichier $i n'existe pas Jimmy")
        }
    }
}

fun lireFichier(i: Int) {
    TODO("Not yet implemented")
}

fun lireDesFichiersJohnny() {
    var cpt = 0
    try {
        for (i in 0 until 10) {
            lireFichier(i)
            cpt = i
            println("fichier $i lu par Johnny")
        }
    } catch (e: FileNotFoundException) {
        println("fichier $cpt n'existe pas Johnny")
    }
}

//Non car il y en a un qui qui vérifie chaque fichier tandis que l'autre ne le fait pas et les vérifie plutot un par uné
