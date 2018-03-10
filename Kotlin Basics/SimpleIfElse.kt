fun main(args:Array<String>)
{
    print("Enter your grade: ")
    var grade = readLine()!!.toDouble()

    if (grade >= 90)
    {
        if (grade < 93)
            println("Your level: A-")
        else if (grade > 93)
            println("Your level: A+")
    }
    else
        println("You should study harder man!")
}