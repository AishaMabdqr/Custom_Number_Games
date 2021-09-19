import kotlin.random.Random

fun main(){

    var num = Random.nextInt(0 , 11)
    var counter = 0
    try{

            print("Enter your first number: ")
            val firstNum = readLine()!!.toInt()
            print("Enter your second number: ")
            val secondNum = readLine()!!.toInt()

        var result = (firstNum * num) + secondNum
        println("$firstNum * X + $secondNum = $result")

        print(" What is the X? ")
        var x = readLine()!!.toInt()

        println(" x = $num")
        if (num == x){
            println(" You got it right!")
        } else {
            println(" Sorry, try again ")
        }

    }catch (e: Exception){
        println("Please enter numbers only")
    }

}