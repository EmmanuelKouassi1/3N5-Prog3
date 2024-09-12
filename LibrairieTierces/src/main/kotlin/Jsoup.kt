import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements


fun main(args: Array<String>) {
    val url = args[0]

    val doc: Document = Jsoup.connect(url).get()
    val links: Elements = doc.select("a")
    for (link: Element in links) {
        val href: String = link.attr("href")
        val text: String = link.text()
        println("$text = $href")
    }
}
