fun makeSimpson() {
    val homer = SimpsonClassDemo(name = "Homer", age = 50, job = "Nuclear Safety")
    homer.age = 51

    print(homer.name + "'s age: " + homer.age)
}

fun main(args: Array<String>) {
    makeSimpson();
}
