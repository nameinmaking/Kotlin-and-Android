fun main(args:Array<String>)
{
    // Adding ? makes that it can either have a value or a null value
    var name:String?
    name = "Vipul"
    //    name = null  Will throw an exception
    /* !! implies the variable should have a value,
       if it does not have a value it will throw an exception*/
    print(name!!)
}