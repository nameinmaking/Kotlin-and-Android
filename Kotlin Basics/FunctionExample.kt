fun main(args:Array<String>)
{
    fun sum(a: Int,b: Int): Int
    {
        return a + b
    }

    print("Enter the first number: ")
    val a:Int = readLine()!!.toInt()
    print("Enter the second number: ")
    val b:Int = readLine()!!.toInt()

    print("$a + $b = " + sum(a,b))

}