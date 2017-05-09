/**
 * Created by vicboma on 09/05/17.
 */

/**
 * Created by vicboma on 09/05/17.
 */
object Main {

    @JvmStatic fun main(args: Array<String>) {
        val init = System.currentTimeMillis()
        //invoke()


       /* for (it in 1..100) {
          print(invoke2(it))
        }*/

        print (invoke3(100))

        println()
        val end = System.currentTimeMillis() - init
        print("Time : $end  ms")
    }

    fun invoke() {
        for (it in 1..100) {
            val Empty = ""
            var str = Empty
            if (it % 3 == 0) str += "Fizz"
            if (it % 5 == 0) str += "Buzz"
            if (str == Empty) str += it
            print(str + " ")
        }
    }

    fun invoke2(i : Int ) = when {
            i % 15 == 0 -> "FizzBuzz "
            i % 3 == 0 -> "Fizz "
            i % 5 == 0 -> "Buzz "
            else -> "$i "
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

}
