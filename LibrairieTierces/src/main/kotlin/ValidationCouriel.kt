import org.apache.commons.validator.EmailValidator


fun main() {
    val emailValidator = EmailValidator.getInstance()
    val emails = listOf(
        "jo@pipo.org",
        "ma_mu@m.ca",
        "a.a@a.ca",
        "a.a@a.aa",
        "ab@ab",
        "a.b@ab",
        "jo"
    )
    for (email in emails) {
        val isValid = emailValidator.isValid(email)
        val result = if (isValid) "Ok" else "   No"
        println("$result : $email")
    }


}
