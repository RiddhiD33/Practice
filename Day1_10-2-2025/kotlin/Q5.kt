fun main(){
    var a = 5
    var fac = 1
    var i = a

    while(i>0){
        fac *= i
        i--
    }
    println("Factorial of "+ a + " is: "+ fac)

}