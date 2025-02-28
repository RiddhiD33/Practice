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
    
    var mySet = mutableSetOf<Int>()

    mySet.addAll(myList)

    println(mySet)

    
}