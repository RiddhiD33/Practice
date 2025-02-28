fun main(){
    var myList = mutableListOf<String>()

    println("Enter your total count of elements: ")

    var count = readLine()!!.toInt()

    for(i in 1..count){
        println("Enter value for $i: ")

        var input = readLine()!!.trim()

        myList += input
    }

    println("This is the normal list: $myList")

    var reversedList = mutableListOf<String>()

    for(i in myList.size - 1 downTo 0){
        reversedList += myList[i]
    }
    println("This is the reversed list: $reversedList")
    
    
}