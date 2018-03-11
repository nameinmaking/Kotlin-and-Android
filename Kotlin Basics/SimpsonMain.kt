import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac

fun makeSimpson() {
    val homer = SimpsonClassDemo(name = "Homer", age = 50, job = "Nuclear Safety")
    homer.age = 51

    println(homer.name + "'s age: " + homer.age)
}

fun main(args: Array<String>) {
    makeSimpson();
    val op = Sum()
    println("Sum: " + op.sum(3,5))
    println("Div: " + op.div(6,3))
}

//By default all the classes are final
class Sum:Div(){
    fun sum(a: Int,b: Int):Int
    {
     return a + b
    }
}

//in-order to make a class inheritable make it open
open class Div{
    fun div(a:Int,b:Int):Int{
        return a/b
    }
}
