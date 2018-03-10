fun main(args:Array<String>)
{
    var n1:Int = 10
    var n2:Int?
    var n2Str:String = "12"

    var n2Float:Float?
    n2Float = n2Str.toFloat()

    n2 = n2Str.toInt()
    println("n1: " + n1)
    println("n2: " + n2)
    println("n2Float: " + n2Float)

    var xpi:Double = 3.14
    println("PI: " + xpi)

    var intPI:Int = xpi.toInt()
    println("intPI: " + intPI.toString())
}