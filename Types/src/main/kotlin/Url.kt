package org.kouassi

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main(){
afficherUrl("google")
}
fun afficherUrl(url:String){
    val doc : Document = Jsoup.connect("http://${url}.com/").get();
    println(doc)

}