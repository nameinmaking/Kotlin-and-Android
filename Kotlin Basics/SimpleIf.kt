fun main(args:Array<String>)
{
    print("Enter your grade: ")
    var grade = readLine()!!.toDouble()

    if (grade >= 90)
    {
        //block of code
        println("Your level is A")
    }

    if (grade>= 50 && grade<=70)
    {
        grade += 10
        println("You get extra 10 points")
    }

    println("Your grade is: $grade")
}