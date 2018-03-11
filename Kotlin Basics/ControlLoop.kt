fun main(args:Array<String>)
{
    println("Goal: To print numbers form 1..10 except 4")
    println("Approach #1")
    for (count in 1..10)
    {
        if (count != 4)
            println("count: $count")
    }

    println("Approach #2")
    for (count in 1..10)
    {
        if (count == 4)
            continue
        println("count: $count")
    }

    println("Goal2: Print only till 4")
    for (count in 1..10)
    {
        if (count == 4)
            break
        println("count: $count")
    }
}