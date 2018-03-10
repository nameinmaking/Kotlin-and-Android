import java.util.*

fun main(args:Array<String>)
{
    print("Enter a number between 1-1000: ")
    var x = readLine()!!.toInt()
    val random = Random()
    when(x)
    {
        1, 2 -> print("Value: $x")
        in 10..100 -> print("The number is between 3 and 100")
        !in 31..1000 -> print("The number is not in between 1 and 1000")
        else ->
        {
            print("A random number from 1-100 as you couldn't enter one: ")
            print(random.nextInt(100 - 1))

        }
    }
}