fun main(){
    println("Enter your count: ")
    var count = readLine()!!.toInt()

    var myList = listOf<Int>()  //var myList = mutableListOf<Int>()(other way)

    for(i in 1..count){
        println("Enter $i elements: ")
        var input = readLine()!!.toInt()

        myList += input
    }
    println(myList)

    var evencount = 0
    var oddcount = 0

    for(i in myList){
        if(i%2==0){
            evencount++
        }else{
            oddcount++
        }
    }

    println(evencount)
    println(oddcount)
}