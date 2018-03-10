import java.util.*

fun main(args:Array<String>)
{
    print("Enter your DOB year: ")
    var DOB:Int = readLine()!!.toInt()
    var currentYear = Calendar.getInstance().get(Calendar.YEAR)
    var age = currentYear - DOB

    println("Your age is $age years")
}