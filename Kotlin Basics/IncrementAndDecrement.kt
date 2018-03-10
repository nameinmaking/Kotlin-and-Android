/*
* Operation Rules | Priority Rules
* 1: ()
* 2: ++, -- (pre-increment/decrement)
* 3: ^
* 4: *, /
* 5: +, -
* 6: =
* 7: ++, -- (post-increment/decrement
*/

fun main(args:Array<String>)
{
    var x = 10
    var y = 11
    var a = ++x + y
    var b = --x + y
    var c = x++ + y

    println("a: (pre-increment) $a")
    println("b: (pre-decrement) $b")
    println("c: (post-increment)$c")
}