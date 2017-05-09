import kotlin.browser.document

/**
 * Created by vicboma on 09/05/17.
 */

fun main(args: Array<String>) {

    val h1 = document.createElement("h1")
    h1.textContent = "FizzBuzz Kotlin JS"
    document.body!!.appendChild(h1)

    val h2 = document.createElement("h2")
    h2.textContent = invoke3(100)
    document.body!!.appendChild(h2)

    println("Hello World!")

}


fun invoke3(i : Int ) : String {
    if (i == 0)
        return ""

    var str = when {
        i % 15 == 0 -> "FizzBuzz "
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i "
    }
    return invoke3(i - 1).plus(str)
}