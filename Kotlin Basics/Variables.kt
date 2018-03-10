fun main(args: Array<String>)
{
    print("Enter the following details \nName: ")
    var name = readLine()
    print("Age: ")
    var age:Int = readLine()!!.toInt()
    print("Department: ")
    var dep:String?
    dep = readLine()
    print("Pi: ")
    var piVal = readLine()!!.toDouble()

    /*Print output*/
    println("Output")
    println("Name: " + name)
    println("Age: " + age)
    println("Department: " + dep)
    println("PI: " + piVal)

    // This can be changed letter
    val pi:Float = 3.14f

}