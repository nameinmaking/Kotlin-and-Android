fun main(args:Array<String>)
{
    // An integer array of size 5, initializes to ZERO
    var intArray = Array<Int>(5){0}
    intArray[3] = 55
    println("Array[3]: " + intArray[3])

    println("All the elements of the Array: ")
    for (element in intArray)
        println(element)

    for (index in 0..4)
        println(intArray[index])

    var strArray = Array<String>(4){""}

    for (index in 0..2)
    {
        print("Enter the " + (index + 1) +  " string: ")
        strArray[index] = readLine()!!
    }
}