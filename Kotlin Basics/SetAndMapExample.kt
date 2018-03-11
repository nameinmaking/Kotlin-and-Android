fun main(args:Array<String>)
{
    val mySet = HashSet<String>()

    mySet.add("Vipul")
    mySet.add("Kirk")
    mySet.add("Kirk")

    println(mySet.size)

    //Map
    val myHashMap = HashMap<String,String>()

    myHashMap.put("name","James")
    myHashMap.put("instrument","Guitar")

    println(myHashMap["instrument"])

}