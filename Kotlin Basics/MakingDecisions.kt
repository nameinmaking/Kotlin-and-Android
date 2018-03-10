fun main(args:Array<String>)
{
    var n1 = 10
    var n2 = 20
    var max:Int?

    var max1 = if(n1>n2) n1 else n2

    if (n1>n2)
        max = n1
    else
        max = n2

    println("max: $max")
    println("max1: $max1")


    print("Enter your age: ")
    var age = readLine()!!.toInt()

    var isYoung = when(age)
    {
        in 1..30 -> true
        else -> false
    }

    print("You are young: $isYoung")
}