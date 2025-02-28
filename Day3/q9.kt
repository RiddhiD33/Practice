fun main(){
    var myList = mutableListOf<Int>()

    println("Enter total count of your elements : ")
    var total = readLine()!!.toInt()

    for(i in 1..total){
        println("Enter value for $i:")
        var value = readLine()!!.toInt()

        myList += value
    }

    for(i in myList){
        if(i > 10){
            println("$i is greater than 10 in this list")
        }
    }
}