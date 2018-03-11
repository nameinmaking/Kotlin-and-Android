fun main(args:Array<String>)
{
    for (item in 1..5)
    {
        if (item == 2)
            println("count: $item")
    }

    println("Outside the loop")

    val myNumbers = intArrayOf(12,15,18,21,24,27)
    val q = myNumbers[0] / 3 * 5
    println("q: " + q)

    for (number in myNumbers)
    {
        val z = number / 3 * 5
        println(z)
    }

    for (i in myNumbers.indices){
        val y = myNumbers[i]/3  * 5
        println(y)
    }
}