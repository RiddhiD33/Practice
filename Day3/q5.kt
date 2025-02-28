fun main() {
    val myMap = mutableMapOf<String, String>()

    print("Enter the total number of elements: ")
    val count = readLine()!!.toInt()

    for (i in 1..count) {
        print("Enter key $i: ")
        val key = readLine()!!.trim()

        print("Enter value for $key: ")
        val value = readLine()!!.trim()

        myMap[key] = value
    }

    println("Map Contents:")
    for ((key, value) in myMap) {
        println("$key -> $value")
    }}