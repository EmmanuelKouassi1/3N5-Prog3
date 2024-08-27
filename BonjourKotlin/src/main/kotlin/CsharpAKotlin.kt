package org.kouassi

fun main(args: Array<String>){

            if (args.size > 0) {
                val nom: String = args[0]
                afficher(nom)
            } else {
                println("Leopold!")
            }

    }
fun afficher(nom: String = "dopdp") {
    println("Bonjour $nom!")
}

