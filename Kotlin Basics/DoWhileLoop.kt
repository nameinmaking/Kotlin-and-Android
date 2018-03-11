fun main(args:Array<String>)
{
    var count = 6
    do {
        println("inside the loop")

        if (count%2 == 0)
            println("Even number: $count")
        count--;
    }while(count>=0)
}