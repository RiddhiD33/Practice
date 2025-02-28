fun main(){
    var myList = mutableListOf<Int>()

    println("Enter total elements: ")
    var total = readLine()!!.toInt()

    for(i in 1..total){
        println("Enter $i element in list: ")
        var input = readLine()!!.toInt()

        myList += input
    }
    println(myList)

    //for min and max
    val max = myList.maxOrNull()?: "List is empty"
    val min = myList.minOrNull()?: "List is empty"

    println("Min is $min")
    println("Max is $max")}